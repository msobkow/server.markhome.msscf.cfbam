
// Description: Java 11 Default Factory implementation for Int64Def.

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
	 *	CFBamInt64DefFactory implementation for Int64Def
	 */
public class CFBamInt64DefDefaultFactory
	implements ICFBamInt64DefFactory
{
	public CFBamInt64DefDefaultFactory() {
	}

	public CFBamInt64DefBuff newBuff() {
		CFBamInt64DefBuff buff =
			new CFBamInt64DefBuff();
		return( buff );
	}

	public CFBamInt64DefHBuff newHBuff() {
		CFBamInt64DefHBuff hbuff =
			new CFBamInt64DefHBuff();
		return( hbuff );
	}
}
