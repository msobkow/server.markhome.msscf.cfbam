
// Description: Java 11 Default Factory implementation for DelSubDep2.

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
	 *	CFBamDelSubDep2Factory implementation for DelSubDep2
	 */
public class CFBamDelSubDep2DefaultFactory
	implements ICFBamDelSubDep2Factory
{
	public CFBamDelSubDep2DefaultFactory() {
	}

	public CFBamDelSubDep2ByContDelDep1IdxKey newContDelDep1IdxKey() {
		CFBamDelSubDep2ByContDelDep1IdxKey key =
			new CFBamDelSubDep2ByContDelDep1IdxKey();
		return( key );
	}

	public CFBamDelSubDep2ByUNameIdxKey newUNameIdxKey() {
		CFBamDelSubDep2ByUNameIdxKey key =
			new CFBamDelSubDep2ByUNameIdxKey();
		return( key );
	}

	public CFBamDelSubDep2Buff newBuff() {
		CFBamDelSubDep2Buff buff =
			new CFBamDelSubDep2Buff();
		return( buff );
	}

	public CFBamDelSubDep2HBuff newHBuff() {
		CFBamDelSubDep2HBuff hbuff =
			new CFBamDelSubDep2HBuff();
		return( hbuff );
	}
}
