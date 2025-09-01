// Description: Java 11 Instance Edit Object interface for CFBam SecGrpInc.

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

public interface ICFBamSecGrpIncEditObj
	extends ICFBamSecGrpIncObj,
		ICFSecSecGrpIncEditObj,
		ICFIntSecGrpIncEditObj
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
	ICFSecSecGrpIncObj create();

	/*
	 *	Update the instance.
	 */
	CFSecSecGrpIncEditObj update();

	/**
	 *	Get the ICFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The ICFSecClusterObj instance referenced by the Cluster key.
	 */
	ICFSecClusterObj getRequiredOwnerCluster();

	/**
	 *	Set the ICFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the ICFSecClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredOwnerCluster( ICFSecClusterObj value );

	/**
	 *	Get the ICFSecSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The ICFSecSecGroupObj instance referenced by the Group key.
	 */
	ICFSecSecGroupObj getRequiredContainerGroup();

	/**
	 *	Set the ICFSecSecGroupObj instance referenced by the Group key.
	 *
	 *	@param	value	the ICFSecSecGroupObj instance to be referenced by the Group key.
	 */
	void setRequiredContainerGroup( ICFSecSecGroupObj value );

	/**
	 *	Get the ICFSecSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@return	The ICFSecSecGroupObj instance referenced by the SubGroup key.
	 */
	ICFSecSecGroupObj getRequiredParentSubGroup();

	/**
	 *	Set the ICFSecSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@param	value	the ICFSecSecGroupObj instance to be referenced by the SubGroup key.
	 */
	void setRequiredParentSubGroup( ICFSecSecGroupObj value );
}
