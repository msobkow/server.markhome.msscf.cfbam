
// Description: Java 11 Factory interface for TZTimestampCol.

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
 *	CFBamTZTimestampColFactory interface for TZTimestampCol
 */
public interface ICFBamTZTimestampColFactory
{

	/**
	 *	Allocate a TableIdx key over TZTimestampCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZTimestampColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a TZTimestampCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZTimestampColBuff newBuff();

	/**
	 *	Allocate a TZTimestampCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZTimestampColHBuff newHBuff();

}
