
// Description: Java 11 Factory interface for TZDateDef.

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
 *	CFBamTZDateDefFactory interface for TZDateDef
 */
public interface ICFBamTZDateDefFactory
{

	/**
	 *	Allocate a TZDateDef instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZDateDefBuff newBuff();

	/**
	 *	Allocate a TZDateDef history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTZDateDefHBuff newHBuff();

}
