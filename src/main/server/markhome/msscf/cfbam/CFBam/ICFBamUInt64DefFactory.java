
// Description: Java 11 Factory interface for UInt64Def.

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
 *	CFBamUInt64DefFactory interface for UInt64Def
 */
public interface ICFBamUInt64DefFactory
{

	/**
	 *	Allocate a UInt64Def instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt64DefBuff newBuff();

	/**
	 *	Allocate a UInt64Def history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt64DefHBuff newHBuff();

}
