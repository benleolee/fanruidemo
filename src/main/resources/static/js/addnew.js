/**
 * Created by thinkive on 2017/11/18.
 */
$(function(){
    $("#saveBtn").click(function () {
        $.post("/project/save",$("#projectForm").serialize(),function (data){
            if(data.code==0){
                window.location.href="/project/viewDetail/"+data.data.idProject;
            }else{
                alert("保存失败！");
            }


        });
    })
})