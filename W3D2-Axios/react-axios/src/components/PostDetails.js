import React from "react";
import Comments from "./Comments";

function PostDetails(props){
    console.log(props);
    return (
       <div>
           {props.postDetails.length>0&&(
               <>
               <h3>{props.postDetails[0].title}</h3>
               <h4>{props.postDetails[0].author}</h4>
               <h1>{props.postDetails[0].content}</h1>
                   <h1><Comments/></h1>

                   <div>
                       <button>EditPost</button>
                       <button onClick={()=>props.deletePostDetails()}>DeletePost</button>
                   </div>
               </>
           )}

       </div>

    )
}
export default PostDetails;