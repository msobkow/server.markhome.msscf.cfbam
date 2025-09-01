
// Description: Java 11 Factory interface for TZDateCol.

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
 *	CFBamTZDateColFactory interface for TZDateCol
 */
public interface ICFBamTZDateColFactory
{

	/**
	 *	Allocate a TableIdx key over TZDateCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZDateColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a TZDateCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZDateColBuff newBuff();

	/**
	 *	Allocate a TZDateCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZDateColHBuff newHBuff();

}
