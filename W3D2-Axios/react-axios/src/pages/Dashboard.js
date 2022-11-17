// import React, {useState} from "react";
import React, {useEffect, useState} from "react";
import Posts from "../components/Posts";
import PostDetails from "../components/PostDetails";
import axios from "axios";
import AddPost from "../components/AddPost/AddPost";

const postDataInitial = [
    { id: 111, title: "Happiness", author: "John" },
    { id: 112, title: "MIU", author: "Dean" },
    { id: 113, title: "Enjoy Life", author: "Jasmine" },
];

function Dashboard() {

    const [postDetails, setPostDetails] = useState({});
    const [title, setTitle] = useState("");
    const [postId,setPostId]=useState(0);
    const [postData, setPostData] = useState(postDataInitial);
    const[track,setTrack]=useState(false);

    // useEffect(()=>{
    //     async function fetchData(){
    //         let data =await fetch("http://localhost:8080/api/v1/posts/");
    //         console.log(data.json());
    //     }
    //     fetchData();
    //
    // },[]);
    useEffect(()=>{
        function fetchData(){
            axios.get("http://localhost:8080/api/v1/posts/")
                .then((response)=>(setPostData(response.data))).catch();
        }
        fetchData();
    },[track])






    function fetchPostById(id) {
        let post = postData.filter((post) => post.id == id);
        console.log(post)
        setPostId(id);
        setPostDetails(post);
    }

    function changeTitle(event) {
        event.preventDefault();
        let copy = [...postData];
        copy[0].title = title == "" ? "Happiness" : title;
        setPostData(copy);
        console.log(postData);
        setTitle("");
    }
    function deletePostDetails(){
       axios.delete(`http://localhost:8080/api/v1/posts/${postId}`)
           .then((response)=>setTrack(!track)).catch();
       setPostDetails([]);

    }
    function addPost(post){
        axios.post(`http://localhost:8080/api/v1/posts/`,post).
        then((response)=>setTrack(!track)).
        catch();

    }

    return (
        <div>
            <Posts data={postData} fetchPostById={fetchPostById} />

            <form onSubmit={changeTitle}>
                <input
                    type="text"
                    value={title}
                    onChange={(event) => setTitle(event.target.value)}
                />
                <button type="submit">Add</button>
            </form>
            <div>
                <PostDetails postDetails={postDetails} deletePostDetails={deletePostDetails} />
            </div>
            <div>
                <AddPost addPost={addPost}/>
            </div>
        </div>
    );
}
export default Dashboard;
