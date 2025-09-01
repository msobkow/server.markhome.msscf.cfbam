
// Description: Java 11 Default Factory implementation for DelSubDep1.

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
	 *	CFBamDelSubDep1Factory implementation for DelSubDep1
	 */
public class CFBamDelSubDep1DefaultFactory
	implements ICFBamDelSubDep1Factory
{
	public CFBamDelSubDep1DefaultFactory() {
	}

	public CFBamDelSubDep1ByDelTopDepIdxKey newDelTopDepIdxKey() {
		CFBamDelSubDep1ByDelTopDepIdxKey key =
			new CFBamDelSubDep1ByDelTopDepIdxKey();
		return( key );
	}

	public CFBamDelSubDep1ByUNameIdxKey newUNameIdxKey() {
		CFBamDelSubDep1ByUNameIdxKey key =
			new CFBamDelSubDep1ByUNameIdxKey();
		return( key );
	}

	public CFBamDelSubDep1Buff newBuff() {
		CFBamDelSubDep1Buff buff =
			new CFBamDelSubDep1Buff();
		return( buff );
	}

	public CFBamDelSubDep1HBuff newHBuff() {
		CFBamDelSubDep1HBuff hbuff =
			new CFBamDelSubDep1HBuff();
		return( hbuff );
	}
}
