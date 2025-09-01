
// Description: Java 11 Default Factory implementation for PopSubDep3.

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
	 *	CFBamPopSubDep3Factory implementation for PopSubDep3
	 */
public class CFBamPopSubDep3DefaultFactory
	implements ICFBamPopSubDep3Factory
{
	public CFBamPopSubDep3DefaultFactory() {
	}

	public CFBamPopSubDep3ByPopSubDep2IdxKey newPopSubDep2IdxKey() {
		CFBamPopSubDep3ByPopSubDep2IdxKey key =
			new CFBamPopSubDep3ByPopSubDep2IdxKey();
		return( key );
	}

	public CFBamPopSubDep3ByUNameIdxKey newUNameIdxKey() {
		CFBamPopSubDep3ByUNameIdxKey key =
			new CFBamPopSubDep3ByUNameIdxKey();
		return( key );
	}

	public CFBamPopSubDep3Buff newBuff() {
		CFBamPopSubDep3Buff buff =
			new CFBamPopSubDep3Buff();
		return( buff );
	}

	public CFBamPopSubDep3HBuff newHBuff() {
		CFBamPopSubDep3HBuff hbuff =
			new CFBamPopSubDep3HBuff();
		return( hbuff );
	}
}
