
// Description: Java 11 Factory interface for Int16Def.

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
 *	CFBamInt16DefFactory interface for Int16Def
 */
public interface ICFBamInt16DefFactory
{

	/**
	 *	Allocate a Int16Def instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt16DefBuff newBuff();

	/**
	 *	Allocate a Int16Def history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt16DefHBuff newHBuff();

}
