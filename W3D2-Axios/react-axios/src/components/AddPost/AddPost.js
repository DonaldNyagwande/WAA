import React, {useState} from "react";

function AddPost(props){
    const [input,setInput]=useState({
        author:"",
        title:"",
        content:""

    });
    function createPost(event){
        console.log(props.addPost)
        event.preventDefault();
        props.addPost(input);
    }
    return (
        <div>
            <form onSubmit={createPost}>
                <label>Author</label>
                <input type="text" onChange={
                    (event)=>{
                        input.author=event.target.value
                        setInput({...input});
                    }}/>
                <br/>
                <label>Title</label><input type={"text"} onChange={
                (event)=>{
                    input.title=event.target.value;
                    setInput({...input});
                }
            }/>
                <br/>
                <label>Content</label><input type={"text"}onChange={
                (event)=>{
                    input.content=event.target.value;
                    setInput({...input});
                }
            }/>
                <br/>
                <button type={"submit"}>Submit</button>
            </form>
        </div>
    )
}
export default AddPost;