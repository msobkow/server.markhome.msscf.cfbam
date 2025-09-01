
// Description: Java 11 Default Factory implementation for DelSubDep3.

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
	 *	CFBamDelSubDep3Factory implementation for DelSubDep3
	 */
public class CFBamDelSubDep3DefaultFactory
	implements ICFBamDelSubDep3Factory
{
	public CFBamDelSubDep3DefaultFactory() {
	}

	public CFBamDelSubDep3ByDelSubDep2IdxKey newDelSubDep2IdxKey() {
		CFBamDelSubDep3ByDelSubDep2IdxKey key =
			new CFBamDelSubDep3ByDelSubDep2IdxKey();
		return( key );
	}

	public CFBamDelSubDep3ByUNameIdxKey newUNameIdxKey() {
		CFBamDelSubDep3ByUNameIdxKey key =
			new CFBamDelSubDep3ByUNameIdxKey();
		return( key );
	}

	public CFBamDelSubDep3Buff newBuff() {
		CFBamDelSubDep3Buff buff =
			new CFBamDelSubDep3Buff();
		return( buff );
	}

	public CFBamDelSubDep3HBuff newHBuff() {
		CFBamDelSubDep3HBuff hbuff =
			new CFBamDelSubDep3HBuff();
		return( hbuff );
	}
}
