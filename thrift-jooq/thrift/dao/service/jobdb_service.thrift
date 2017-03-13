namespace java com.moseeker.thrift.gen.dao.service
namespace py thrift_gen.gen.dao.service.jobdb

include "../../common/struct/common_struct.thrift"
include "../../position/struct/position_struct.thrift"
include "../../application/struct/application_struct.thrift"
include "../struct/jobdb_struct.thrift"

service JobDBDao {
	list<jobdb_struct.JobPositionDO> getPositions(1:common_struct.CommonQuery query);
	jobdb_struct.JobPositionDO getPosition(1:common_struct.CommonQuery query) throws (1:common_struct.CURDException e);

	list<jobdb_struct.JobApplicationDO> getApplications(1:common_struct.CommonQuery query) throws (1:common_struct.CURDException e);
    jobdb_struct.JobApplicationDO getApplication(1:common_struct.CommonQuery query) throws (1:common_struct.CURDException e);
    
    common_struct.Response getJobCustoms(1:common_struct.CommonQuery query);
    common_struct.Response getJobOccupations(1:common_struct.CommonQuery query);
}
