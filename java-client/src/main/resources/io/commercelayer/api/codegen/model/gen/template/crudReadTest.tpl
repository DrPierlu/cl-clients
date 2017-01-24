// GET

${GetOperation} getOp = ApiOperations.${GetOperation}();
getOp.setId(res.getId());


ApiRequest<${GetOperation}> getReq = new ApiRequest<>(getOp);

ApiResponse<${ResourceType}> getRes = test(getReq, caller);


${TestAssertions}


return getRes;