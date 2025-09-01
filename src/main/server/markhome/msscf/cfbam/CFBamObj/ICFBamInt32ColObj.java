// Description: Java 11 Object interface for CFBam Int32Col.

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

public interface ICFBamInt32ColObj
	extends ICFBamInt32DefObj
{
	/**
	 *	Get the current edition of this Int32Col instance as a ICFBamInt32ColEditObj.
	 *
	 *	@return	The ICFBamInt32ColEditObj edition of this instance.
	 */
	ICFBamInt32ColEditObj getEditAsInt32Col();

	/**
	 *	Get the ICFBamInt32ColTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamInt32ColTableObj table cache which manages this instance.
	 */
	ICFBamInt32ColTableObj getInt32ColTable();

	/**
	 *	Get the CFBamInt32ColBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamInt32ColBuff instance which currently backs this object.
	 */
	CFBamInt32ColBuff getInt32ColBuff();

	/**
	 *	Get the required long attribute TableId.
	 *
	 *	@return	The required long attribute TableId.
	 */
	long getRequiredTableId();

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

}
