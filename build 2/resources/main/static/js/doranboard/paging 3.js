$("a.change-page").on("click", function(e){
    e.preventDefault();
    let page = $(this).attr("href");
    let type = $("select[name=type]").val();
    let keyword = $("input[name=keyword]").val();
    location.href = `/doranboard/doranboard?page=${page}&type=${type}&keyword=${keyword}`;
});