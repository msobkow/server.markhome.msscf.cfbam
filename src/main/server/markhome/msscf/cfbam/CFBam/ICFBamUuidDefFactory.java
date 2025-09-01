
// Description: Java 11 Factory interface for UuidDef.

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
 *	CFBamUuidDefFactory interface for UuidDef
 */
public interface ICFBamUuidDefFactory
{

	/**
	 *	Allocate a UuidDef instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUuidDefBuff newBuff();

	/**
	 *	Allocate a UuidDef history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamUuidDefHBuff newHBuff();

}
