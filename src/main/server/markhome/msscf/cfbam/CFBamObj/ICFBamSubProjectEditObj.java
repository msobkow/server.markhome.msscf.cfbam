// Description: Java 11 Instance Edit Object interface for CFBam SubProject.

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

public interface ICFBamSubProjectEditObj
	extends ICFBamSubProjectObj,
		ICFIntSubProjectEditObj
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
	ICFIntSubProjectObj create();

	/*
	 *	Update the instance.
	 */
	CFIntSubProjectEditObj update();

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
	 *	Get the ICFIntTopProjectObj instance referenced by the ParentTPrj key.
	 *
	 *	@return	The ICFIntTopProjectObj instance referenced by the ParentTPrj key.
	 */
	ICFIntTopProjectObj getRequiredContainerParentTPrj();

	/**
	 *	Set the ICFIntTopProjectObj instance referenced by the ParentTPrj key.
	 *
	 *	@param	value	the ICFIntTopProjectObj instance to be referenced by the ParentTPrj key.
	 */
	void setRequiredContainerParentTPrj( ICFIntTopProjectObj value );
}
