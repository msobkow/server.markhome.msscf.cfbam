// Description: Java 11 Instance Edit Object interface for CFBam TSecGrpInc.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamTSecGrpIncEditObj
	extends ICFBamTSecGrpIncObj,
		ICFSecTSecGrpIncEditObj,
		ICFIntTSecGrpIncEditObj
{
	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecTSecGrpIncObj create();

	/*
	 *	Update the instance.
	 */
	CFSecTSecGrpIncEditObj update();

	/**
	 *	Get the ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The ICFSecTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Set the ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the ICFSecTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( ICFSecTenantObj value );

	/**
	 *	Get the ICFSecTSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The ICFSecTSecGroupObj instance referenced by the Group key.
	 */
	ICFSecTSecGroupObj getRequiredContainerGroup();

	/**
	 *	Set the ICFSecTSecGroupObj instance referenced by the Group key.
	 *
	 *	@param	value	the ICFSecTSecGroupObj instance to be referenced by the Group key.
	 */
	void setRequiredContainerGroup( ICFSecTSecGroupObj value );

	/**
	 *	Get the ICFSecTSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@return	The ICFSecTSecGroupObj instance referenced by the SubGroup key.
	 */
	ICFSecTSecGroupObj getRequiredParentSubGroup();

	/**
	 *	Set the ICFSecTSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@param	value	the ICFSecTSecGroupObj instance to be referenced by the SubGroup key.
	 */
	void setRequiredParentSubGroup( ICFSecTSecGroupObj value );
}
