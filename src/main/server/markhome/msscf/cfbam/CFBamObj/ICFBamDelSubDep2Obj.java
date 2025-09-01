// Description: Java 11 Object interface for CFBam DelSubDep2.

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

public interface ICFBamDelSubDep2Obj
	extends ICFBamDelDepObj
{
	/**
	 *	Get the current edition of this DelSubDep2 instance as a ICFBamDelSubDep2EditObj.
	 *
	 *	@return	The ICFBamDelSubDep2EditObj edition of this instance.
	 */
	ICFBamDelSubDep2EditObj getEditAsDelSubDep2();

	/**
	 *	Get the ICFBamDelSubDep2TableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamDelSubDep2TableObj table cache which manages this instance.
	 */
	ICFBamDelSubDep2TableObj getDelSubDep2Table();

	/**
	 *	Get the CFBamDelSubDep2Buff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamDelSubDep2Buff instance which currently backs this object.
	 */
	CFBamDelSubDep2Buff getDelSubDep2Buff();

	/**
	 *	Get the required long attribute DelSubDep1TenantId.
	 *
	 *	@return	The required long attribute DelSubDep1TenantId.
	 */
	long getRequiredDelSubDep1TenantId();

	/**
	 *	Get the required long attribute DelSubDep1Id.
	 *
	 *	@return	The required long attribute DelSubDep1Id.
	 */
	long getRequiredDelSubDep1Id();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamDelSubDep1Obj instance referenced by the DelSubDep1 key.
	 *
	 *	@return	The required ICFBamDelSubDep1Obj instance referenced by the DelSubDep1 key.
	 */
	ICFBamDelSubDep1Obj getRequiredContainerDelSubDep1();

	/**
	 *	Get the required ICFBamDelSubDep1Obj instance referenced by the DelSubDep1 key.
	 *
	 *	@return	The required ICFBamDelSubDep1Obj instance referenced by the DelSubDep1 key.
	 */
	ICFBamDelSubDep1Obj getRequiredContainerDelSubDep1( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamDelSubDep3Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional ICFBamDelSubDep3Obj[] array of instances referenced by the DelDep key.
	 */
	List<ICFBamDelSubDep3Obj> getOptionalComponentsDelDep();

	/**
	 *	Get the array of optional ICFBamDelSubDep3Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional ICFBamDelSubDep3Obj[] array of instances referenced by the DelDep key.
	 */
	List<ICFBamDelSubDep3Obj> getOptionalComponentsDelDep( boolean forceRead );

}
