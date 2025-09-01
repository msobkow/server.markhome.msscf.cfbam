
// Description: Java 11 Default Factory implementation for PopSubDep2.

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
	 *	CFBamPopSubDep2Factory implementation for PopSubDep2
	 */
public class CFBamPopSubDep2DefaultFactory
	implements ICFBamPopSubDep2Factory
{
	public CFBamPopSubDep2DefaultFactory() {
	}

	public CFBamPopSubDep2ByPopSubDep1IdxKey newPopSubDep1IdxKey() {
		CFBamPopSubDep2ByPopSubDep1IdxKey key =
			new CFBamPopSubDep2ByPopSubDep1IdxKey();
		return( key );
	}

	public CFBamPopSubDep2ByUNameIdxKey newUNameIdxKey() {
		CFBamPopSubDep2ByUNameIdxKey key =
			new CFBamPopSubDep2ByUNameIdxKey();
		return( key );
	}

	public CFBamPopSubDep2Buff newBuff() {
		CFBamPopSubDep2Buff buff =
			new CFBamPopSubDep2Buff();
		return( buff );
	}

	public CFBamPopSubDep2HBuff newHBuff() {
		CFBamPopSubDep2HBuff hbuff =
			new CFBamPopSubDep2HBuff();
		return( hbuff );
	}
}
