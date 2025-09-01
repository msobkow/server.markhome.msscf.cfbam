// Description: Java 11 Object interface for CFBam ClearTopDep.

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

public interface ICFBamClearTopDepObj
	extends ICFBamClearDepObj
{
	/**
	 *	Move this object up in the chain and refresh the cache.
	 *
	 *	@return	ICFBamClearTopDepObj the reference to the moved and refreshed instance.
	 */
	ICFBamClearTopDepObj moveUp();

	/**
	 *	Move this object down in the chain and refresh the cache.
	 *
	 *	@return	ICFBamClearTopDepObj the reference to the moved and refreshed instance.
	 */
	ICFBamClearTopDepObj moveDown();

	/**
	 *	Get the current edition of this ClearTopDep instance as a ICFBamClearTopDepEditObj.
	 *
	 *	@return	The ICFBamClearTopDepEditObj edition of this instance.
	 */
	ICFBamClearTopDepEditObj getEditAsClearTopDep();

	/**
	 *	Get the ICFBamClearTopDepTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamClearTopDepTableObj table cache which manages this instance.
	 */
	ICFBamClearTopDepTableObj getClearTopDepTable();

	/**
	 *	Get the CFBamClearTopDepBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamClearTopDepBuff instance which currently backs this object.
	 */
	CFBamClearTopDepBuff getClearTopDepBuff();

	/**
	 *	Get the required long attribute TableTenantId.
	 *
	 *	@return	The required long attribute TableTenantId.
	 */
	long getRequiredTableTenantId();

	/**
	 *	Get the required long attribute TableId.
	 *
	 *	@return	The required long attribute TableId.
	 */
	long getRequiredTableId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional Long attribute PrevTenantId.
	 *
	 *	@return	The optional Long attribute PrevTenantId.
	 */
	Long getOptionalPrevTenantId();

	/**
	 *	Get the optional Long attribute PrevId.
	 *
	 *	@return	The optional Long attribute PrevId.
	 */
	Long getOptionalPrevId();

	/**
	 *	Get the optional Long attribute NextTenantId.
	 *
	 *	@return	The optional Long attribute NextTenantId.
	 */
	Long getOptionalNextTenantId();

	/**
	 *	Get the optional Long attribute NextId.
	 *
	 *	@return	The optional Long attribute NextId.
	 */
	Long getOptionalNextId();

	/**
	 *	Get the required ICFBamTableObj instance referenced by the Table key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the Table key.
	 */
	ICFBamTableObj getRequiredContainerTable();

	/**
	 *	Get the required ICFBamTableObj instance referenced by the Table key.
	 *
	 *	@return	The required ICFBamTableObj instance referenced by the Table key.
	 */
	ICFBamTableObj getRequiredContainerTable( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamClearSubDep1Obj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The optional ICFBamClearSubDep1Obj[] array of instances referenced by the ClearDep key.
	 */
	List<ICFBamClearSubDep1Obj> getOptionalComponentsClearDep();

	/**
	 *	Get the array of optional ICFBamClearSubDep1Obj array of instances referenced by the ClearDep key.
	 *
	 *	@return	The optional ICFBamClearSubDep1Obj[] array of instances referenced by the ClearDep key.
	 */
	List<ICFBamClearSubDep1Obj> getOptionalComponentsClearDep( boolean forceRead );

	/**
	 *	Get the optional ICFBamClearTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The optional ICFBamClearTopDepObj instance referenced by the Prev key.
	 */
	ICFBamClearTopDepObj getOptionalLookupPrev();

	/**
	 *	Get the optional ICFBamClearTopDepObj instance referenced by the Prev key.
	 *
	 *	@return	The optional ICFBamClearTopDepObj instance referenced by the Prev key.
	 */
	ICFBamClearTopDepObj getOptionalLookupPrev( boolean forceRead );

	/**
	 *	Get the optional ICFBamClearTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The optional ICFBamClearTopDepObj instance referenced by the Next key.
	 */
	ICFBamClearTopDepObj getOptionalLookupNext();

	/**
	 *	Get the optional ICFBamClearTopDepObj instance referenced by the Next key.
	 *
	 *	@return	The optional ICFBamClearTopDepObj instance referenced by the Next key.
	 */
	ICFBamClearTopDepObj getOptionalLookupNext( boolean forceRead );

}
