
// Description: Java 11 Factory interface for TableCol.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

/*
 *	CFBamTableColFactory interface for TableCol
 */
public interface ICFBamTableColFactory
{

	/**
	 *	Allocate a TableIdx key over TableCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a DataIdx key over TableCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableColByDataIdxKey newDataIdxKey();

	/**
	 *	Allocate a TableCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableColBuff newBuff();

	/**
	 *	Allocate a TableCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTableColHBuff newHBuff();

}
