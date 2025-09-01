// Description: Java 11 Object interface for CFBam Scope.

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

public interface ICFBamScopeObj
	extends ICFLibAnyObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who created this instance.
	 */
	ICFSecSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who updated this instance.
	 */
	ICFSecSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a Scope.
	 *
	 *	@return	CFBamScopeObj instance which should be subsequently referenced.
	 */
	ICFBamScopeObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFBamScopeObj the reference to the cached or read (realised) instance.
	 */
	ICFBamScopeObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFBamScopeObj the reference to the cached or read (realised) instance.
	 */
	ICFBamScopeObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this Scope instance.
	 *
	 *	@return	The newly locked ICFBamScopeEditObj edition of this instance.
	 */
	ICFBamScopeEditObj beginEdit();

	/**
	 *	End this edition of this Scope instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Scope instance.
	 *
	 *	@return	The ICFBamScopeEditObj edition of this instance.
	 */
	ICFBamScopeEditObj getEdit();

	/**
	 *	Get the current edition of this Scope instance as a ICFBamScopeEditObj.
	 *
	 *	@return	The ICFBamScopeEditObj edition of this instance.
	 */
	ICFBamScopeEditObj getEditAsScope();

	/**
	 *	Get the ICFBamScopeTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamScopeTableObj table cache which manages this instance.
	 */
	ICFBamScopeTableObj getScopeTable();

	/**
	 *	Get the ICFBamSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFBamSchemaObj schema cache which manages this instance.
	 */
	ICFBamSchemaObj getSchema();

	/**
	 *	Get the CFBamScopeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamScopeBuff instance which currently backs this object.
	 */
	CFBamScopeBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFBamScopeBuff value );

	/**
	 *	Get the CFBamScopeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamScopeBuff instance which currently backs this object.
	 */
	CFBamScopeBuff getScopeBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFBamScopePKey primary key for this instance.
	 */
	CFBamScopePKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFBamScopePKey primary key value for this instance.
	 */
	void setPKey( CFBamScopePKey value );

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required long attribute TenantId.
	 *
	 *	@return	The required long attribute TenantId.
	 */
	long getRequiredTenantId();

	/**
	 *	Get the required long attribute Id.
	 *
	 *	@return	The required long attribute Id.
	 */
	long getRequiredId();

	/**
	 *	Get the required ICFBamTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFBamTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFSecTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
