
// Description: Java 11 Default Factory implementation for PopSubDep1.

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
	 *	CFBamPopSubDep1Factory implementation for PopSubDep1
	 */
public class CFBamPopSubDep1DefaultFactory
	implements ICFBamPopSubDep1Factory
{
	public CFBamPopSubDep1DefaultFactory() {
	}

	public CFBamPopSubDep1ByPopTopDepIdxKey newPopTopDepIdxKey() {
		CFBamPopSubDep1ByPopTopDepIdxKey key =
			new CFBamPopSubDep1ByPopTopDepIdxKey();
		return( key );
	}

	public CFBamPopSubDep1ByUNameIdxKey newUNameIdxKey() {
		CFBamPopSubDep1ByUNameIdxKey key =
			new CFBamPopSubDep1ByUNameIdxKey();
		return( key );
	}

	public CFBamPopSubDep1Buff newBuff() {
		CFBamPopSubDep1Buff buff =
			new CFBamPopSubDep1Buff();
		return( buff );
	}

	public CFBamPopSubDep1HBuff newHBuff() {
		CFBamPopSubDep1HBuff hbuff =
			new CFBamPopSubDep1HBuff();
		return( hbuff );
	}
}
