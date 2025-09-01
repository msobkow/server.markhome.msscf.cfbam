// Description: Java 11 Object interface for CFBam URLProtocol.

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

public interface ICFBamURLProtocolObj
	extends ICFIntURLProtocolObj
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
	 *	Realise this instance of a URLProtocol.
	 *
	 *	@return	CFIntURLProtocolObj instance which should be subsequently referenced.
	 */
	ICFIntURLProtocolObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFIntURLProtocolObj the reference to the cached or read (realised) instance.
	 */
	ICFIntURLProtocolObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFIntURLProtocolObj the reference to the cached or read (realised) instance.
	 */
	ICFIntURLProtocolObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this URLProtocol instance.
	 *
	 *	@return	The newly locked ICFIntURLProtocolEditObj edition of this instance.
	 */
	ICFIntURLProtocolEditObj beginEdit();

	/**
	 *	End this edition of this URLProtocol instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this URLProtocol instance.
	 *
	 *	@return	The ICFIntURLProtocolEditObj edition of this instance.
	 */
	ICFIntURLProtocolEditObj getEdit();

	/**
	 *	Get the current edition of this URLProtocol instance as a ICFIntURLProtocolEditObj.
	 *
	 *	@return	The ICFIntURLProtocolEditObj edition of this instance.
	 */
	ICFIntURLProtocolEditObj getEditAsURLProtocol();

	/**
	 *	Get the ICFIntURLProtocolTableObj table cache which manages this instance.
	 *
	 *	@return	ICFIntURLProtocolTableObj table cache which manages this instance.
	 */
	ICFIntURLProtocolTableObj getURLProtocolTable();

	/**
	 *	Get the ICFIntSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFIntSchemaObj schema cache which manages this instance.
	 */
	ICFIntSchemaObj getSchema();

	/**
	 *	Get the CFIntURLProtocolBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFIntURLProtocolBuff instance which currently backs this object.
	 */
	CFIntURLProtocolBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFIntURLProtocolBuff value );

	/**
	 *	Get the CFIntURLProtocolBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFIntURLProtocolBuff instance which currently backs this object.
	 */
	CFIntURLProtocolBuff getURLProtocolBuff();

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
	 *	Get the required int attribute URLProtocolId.
	 *
	 *	@return	The required int attribute URLProtocolId.
	 */
	int getRequiredURLProtocolId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required String attribute Description.
	 *
	 *	@return	The required String attribute Description.
	 */
	String getRequiredDescription();

	/**
	 *	Get the required boolean attribute IsSecure.
	 *
	 *	@return	The required boolean attribute IsSecure.
	 */
	boolean getRequiredIsSecure();

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
