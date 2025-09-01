// Description: Java 11 Instance Edit Object interface for CFBam ISOCtryCcy.

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

public interface ICFBamISOCtryCcyEditObj
	extends ICFBamISOCtryCcyObj,
		ICFSecISOCtryCcyEditObj,
		ICFIntISOCtryCcyEditObj
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
	ICFSecISOCtryCcyObj create();

	/*
	 *	Update the instance.
	 */
	CFSecISOCtryCcyEditObj update();

	/**
	 *	Get the ICFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@return	The ICFSecISOCtryObj instance referenced by the Ctry key.
	 */
	ICFSecISOCtryObj getRequiredContainerCtry();

	/**
	 *	Set the ICFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@param	value	the ICFSecISOCtryObj instance to be referenced by the Ctry key.
	 */
	void setRequiredContainerCtry( ICFSecISOCtryObj value );

	/**
	 *	Get the ICFSecISOCcyObj instance referenced by the Ccy key.
	 *
	 *	@return	The ICFSecISOCcyObj instance referenced by the Ccy key.
	 */
	ICFSecISOCcyObj getRequiredParentCcy();

	/**
	 *	Set the ICFSecISOCcyObj instance referenced by the Ccy key.
	 *
	 *	@param	value	the ICFSecISOCcyObj instance to be referenced by the Ccy key.
	 */
	void setRequiredParentCcy( ICFSecISOCcyObj value );
}
