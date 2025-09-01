// Description: Java 11 Object interface for CFBam PopTopDep.

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
import server.markhome.msscf.cfbam.CFBam.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamPopTopDepObj
	extends ICFBamPopDepObj
{
	/**
	 *	Get the current edition of this PopTopDep instance as a ICFBamPopTopDepEditObj.
	 *
	 *	@return	The ICFBamPopTopDepEditObj edition of this instance.
	 */
	ICFBamPopTopDepEditObj getEditAsPopTopDep();

	/**
	 *	Get the ICFBamPopTopDepTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamPopTopDepTableObj table cache which manages this instance.
	 */
	ICFBamPopTopDepTableObj getPopTopDepTable();

	/**
	 *	Get the CFBamPopTopDepBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamPopTopDepBuff instance which currently backs this object.
	 */
	CFBamPopTopDepBuff getPopTopDepBuff();

	/**
	 *	Get the required long attribute ContRelationTenantId.
	 *
	 *	@return	The required long attribute ContRelationTenantId.
	 */
	long getRequiredContRelationTenantId();

	/**
	 *	Get the required long attribute ContRelationId.
	 *
	 *	@return	The required long attribute ContRelationId.
	 */
	long getRequiredContRelationId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamRelationObj instance referenced by the ContRelation key.
	 *
	 *	@return	The required ICFBamRelationObj instance referenced by the ContRelation key.
	 */
	ICFBamRelationObj getRequiredContainerContRelation();

	/**
	 *	Get the required ICFBamRelationObj instance referenced by the ContRelation key.
	 *
	 *	@return	The required ICFBamRelationObj instance referenced by the ContRelation key.
	 */
	ICFBamRelationObj getRequiredContainerContRelation( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamPopSubDep1Obj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopSubDep1Obj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopSubDep1Obj> getOptionalComponentsPopDep();

	/**
	 *	Get the array of optional ICFBamPopSubDep1Obj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopSubDep1Obj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopSubDep1Obj> getOptionalComponentsPopDep( boolean forceRead );

}
