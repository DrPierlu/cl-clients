// PUT

${PutOperation} putOp = ApiOperations.${PutOperation}();
putOp.setId(oldRes.getId());

${ResourceType} res = new ${ResourceType}();

${PayloadData}

putOp.setPayload(res);


ApiRequest<${PutOperation}> putReq = new ApiRequest<>(putOp);

ApiResponse<${ResourceType}> putRes = test(putReq, caller);


${TestAssertions}


return putRes;