// Description: Java 11 Object interface for CFBam TableCol.

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

public interface ICFBamTableColObj
	extends ICFBamValueObj
{
	/**
	 *	Get the current edition of this TableCol instance as a ICFBamTableColEditObj.
	 *
	 *	@return	The ICFBamTableColEditObj edition of this instance.
	 */
	ICFBamTableColEditObj getEditAsTableCol();

	/**
	 *	Get the ICFBamTableColTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamTableColTableObj table cache which manages this instance.
	 */
	ICFBamTableColTableObj getTableColTable();

	/**
	 *	Get the CFBamTableColBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamTableColBuff instance which currently backs this object.
	 */
	CFBamTableColBuff getTableColBuff();

	/**
	 *	Get the required long attribute TableId.
	 *
	 *	@return	The required long attribute TableId.
	 */
	long getRequiredTableId();

	/**
	 *	Get the optional String attribute DbName.
	 *
	 *	@return	The optional String attribute DbName.
	 */
	String getOptionalDbName();

	/**
	 *	Get the optional Long attribute DataTenantId.
	 *
	 *	@return	The optional Long attribute DataTenantId.
	 */
	Long getOptionalDataTenantId();

	/**
	 *	Get the optional Long attribute DataId.
	 *
	 *	@return	The optional Long attribute DataId.
	 */
	Long getOptionalDataId();

	/**
	 *	Get the optional String attribute XmlElementName.
	 *
	 *	@return	The optional String attribute XmlElementName.
	 */
	String getOptionalXmlElementName();

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
	 *	Get the required ICFBamValueObj instance referenced by the DataType key.
	 *
	 *	@return	The required ICFBamValueObj instance referenced by the DataType key.
	 */
	ICFBamValueObj getRequiredParentDataType();

	/**
	 *	Get the required ICFBamValueObj instance referenced by the DataType key.
	 *
	 *	@return	The required ICFBamValueObj instance referenced by the DataType key.
	 */
	ICFBamValueObj getRequiredParentDataType( boolean forceRead );

}
