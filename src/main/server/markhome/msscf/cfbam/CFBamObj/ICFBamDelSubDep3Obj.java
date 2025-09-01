// Description: Java 11 Object interface for CFBam DelSubDep3.

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

public interface ICFBamDelSubDep3Obj
	extends ICFBamDelDepObj
{
	/**
	 *	Get the current edition of this DelSubDep3 instance as a ICFBamDelSubDep3EditObj.
	 *
	 *	@return	The ICFBamDelSubDep3EditObj edition of this instance.
	 */
	ICFBamDelSubDep3EditObj getEditAsDelSubDep3();

	/**
	 *	Get the ICFBamDelSubDep3TableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamDelSubDep3TableObj table cache which manages this instance.
	 */
	ICFBamDelSubDep3TableObj getDelSubDep3Table();

	/**
	 *	Get the CFBamDelSubDep3Buff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamDelSubDep3Buff instance which currently backs this object.
	 */
	CFBamDelSubDep3Buff getDelSubDep3Buff();

	/**
	 *	Get the required long attribute DelSubDep2TenantId.
	 *
	 *	@return	The required long attribute DelSubDep2TenantId.
	 */
	long getRequiredDelSubDep2TenantId();

	/**
	 *	Get the required long attribute DelSubDep2Id.
	 *
	 *	@return	The required long attribute DelSubDep2Id.
	 */
	long getRequiredDelSubDep2Id();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamDelSubDep2Obj instance referenced by the DelSubDep2 key.
	 *
	 *	@return	The required ICFBamDelSubDep2Obj instance referenced by the DelSubDep2 key.
	 */
	ICFBamDelSubDep2Obj getRequiredContainerDelSubDep2();

	/**
	 *	Get the required ICFBamDelSubDep2Obj instance referenced by the DelSubDep2 key.
	 *
	 *	@return	The required ICFBamDelSubDep2Obj instance referenced by the DelSubDep2 key.
	 */
	ICFBamDelSubDep2Obj getRequiredContainerDelSubDep2( boolean forceRead );

}
