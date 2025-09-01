
// Description: Java 11 Factory interface for UInt32Def.

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
 *	CFBamUInt32DefFactory interface for UInt32Def
 */
public interface ICFBamUInt32DefFactory
{

	/**
	 *	Allocate a UInt32Def instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt32DefBuff newBuff();

	/**
	 *	Allocate a UInt32Def history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUInt32DefHBuff newHBuff();

}
