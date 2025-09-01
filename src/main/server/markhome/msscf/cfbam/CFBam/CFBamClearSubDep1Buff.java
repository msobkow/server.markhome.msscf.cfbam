// Description: Java 11 implementation of a ClearSubDep1 buffer object.

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
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

public class CFBamClearSubDep1Buff
	extends CFBamClearDepBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a811";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long CLEARTOPDEPTENANTID_INIT_VALUE = 0L;
	public static final long CLEARTOPDEPID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long CLEARTOPDEPTENANTID_MIN_VALUE = 0L;
	public static final long CLEARTOPDEPID_MIN_VALUE = 0L;
	protected long requiredClearTopDepTenantId;
	protected long requiredClearTopDepId;
	protected String requiredName;
	public CFBamClearSubDep1Buff() {
		super();
		requiredClearTopDepTenantId = CFBamClearSubDep1Buff.CLEARTOPDEPTENANTID_INIT_VALUE;
		requiredClearTopDepId = CFBamClearSubDep1Buff.CLEARTOPDEPID_INIT_VALUE;
		requiredName = new String( CFBamClearSubDep1Buff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredClearTopDepTenantId() {
		return( requiredClearTopDepTenantId );
	}

	public void setRequiredClearTopDepTenantId( long value ) {
		if( value < CFBamClearSubDep1Buff.CLEARTOPDEPTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClearTopDepTenantId",
				1,
				"value",
				value,
				CFBamClearSubDep1Buff.CLEARTOPDEPTENANTID_MIN_VALUE );
		}
		requiredClearTopDepTenantId = value;
	}

	public long getRequiredClearTopDepId() {
		return( requiredClearTopDepId );
	}

	public void setRequiredClearTopDepId( long value ) {
		if( value < CFBamClearSubDep1Buff.CLEARTOPDEPID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClearTopDepId",
				1,
				"value",
				value,
				CFBamClearSubDep1Buff.CLEARTOPDEPID_MIN_VALUE );
		}
		requiredClearTopDepId = value;
	}

	public String getRequiredName() {
		return( requiredName );
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		if( value.length() > 192 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamClearSubDep1Buff ) {
			CFBamClearSubDep1Buff rhs = (CFBamClearSubDep1Buff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredClearTopDepTenantId() != rhs.getRequiredClearTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredClearTopDepId() != rhs.getRequiredClearTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamScopePKey ) {
			CFBamScopePKey rhs = (CFBamScopePKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamClearSubDep1HBuff ) {
			CFBamClearSubDep1HBuff rhs = (CFBamClearSubDep1HBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredClearTopDepTenantId() != rhs.getRequiredClearTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredClearTopDepId() != rhs.getRequiredClearTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamScopeHPKey ) {
			CFBamScopeHPKey rhs = (CFBamScopeHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamClearSubDep1ByClearTopDepIdxKey ) {
			CFBamClearSubDep1ByClearTopDepIdxKey rhs = (CFBamClearSubDep1ByClearTopDepIdxKey)obj;
			if( getRequiredClearTopDepTenantId() != rhs.getRequiredClearTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredClearTopDepId() != rhs.getRequiredClearTopDepId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamClearSubDep1ByUNameIdxKey ) {
			CFBamClearSubDep1ByUNameIdxKey rhs = (CFBamClearSubDep1ByUNameIdxKey)obj;
			if( getRequiredClearTopDepTenantId() != rhs.getRequiredClearTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredClearTopDepId() != rhs.getRequiredClearTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + (int)( getRequiredClearTopDepTenantId() );
		hashCode = hashCode + (int)( getRequiredClearTopDepId() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamClearSubDep1Buff ) {
			CFBamClearSubDep1Buff rhs = (CFBamClearSubDep1Buff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredClearTopDepTenantId() < rhs.getRequiredClearTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepTenantId() > rhs.getRequiredClearTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredClearTopDepId() < rhs.getRequiredClearTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepId() > rhs.getRequiredClearTopDepId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamScopePKey ) {
			CFBamScopePKey rhs = (CFBamScopePKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamScopeHPKey ) {
			CFBamScopeHPKey rhs = (CFBamScopeHPKey)obj;
			{
				int lhsRequiredRevision = getRequiredRevision();
				int rhsRequiredRevision = rhs.getRequiredRevision();
				if( lhsRequiredRevision < rhsRequiredRevision ) {
					return( -1 );
				}
				else if( lhsRequiredRevision > rhsRequiredRevision ) {
					return( 1 );
				}
			}
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamClearSubDep1HBuff ) {
			CFBamClearSubDep1HBuff rhs = (CFBamClearSubDep1HBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredClearTopDepTenantId() < rhs.getRequiredClearTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepTenantId() > rhs.getRequiredClearTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredClearTopDepId() < rhs.getRequiredClearTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepId() > rhs.getRequiredClearTopDepId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamClearSubDep1ByClearTopDepIdxKey ) {
			CFBamClearSubDep1ByClearTopDepIdxKey rhs = (CFBamClearSubDep1ByClearTopDepIdxKey)obj;

			if( getRequiredClearTopDepTenantId() < rhs.getRequiredClearTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepTenantId() > rhs.getRequiredClearTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredClearTopDepId() < rhs.getRequiredClearTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepId() > rhs.getRequiredClearTopDepId() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof CFBamClearSubDep1ByUNameIdxKey ) {
			CFBamClearSubDep1ByUNameIdxKey rhs = (CFBamClearSubDep1ByUNameIdxKey)obj;

			if( getRequiredClearTopDepTenantId() < rhs.getRequiredClearTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepTenantId() > rhs.getRequiredClearTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredClearTopDepId() < rhs.getRequiredClearTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepId() > rhs.getRequiredClearTopDepId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( CFBamScopeBuff src ) {
		if( src instanceof CFBamClearSubDep1Buff ) {
			setClearSubDep1Buff( (CFBamClearSubDep1Buff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamClearSubDep1Buff" );
		}
	}

	public void setClearSubDep1Buff( CFBamClearSubDep1Buff src ) {
		super.setClearDepBuff( src );
		setRequiredClearTopDepTenantId( src.getRequiredClearTopDepTenantId() );
		setRequiredClearTopDepId( src.getRequiredClearTopDepId() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( CFBamScopeHBuff src ) {
		if( src instanceof CFBamClearSubDep1HBuff ) {
			setClearSubDep1Buff( (CFBamClearSubDep1HBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamClearSubDep1HBuff" );
		}
	}

	public void setClearSubDep1Buff( CFBamClearSubDep1HBuff src ) {
		super.setClearDepBuff( src );
		setRequiredClearTopDepTenantId( src.getRequiredClearTopDepTenantId() );
		setRequiredClearTopDepId( src.getRequiredClearTopDepId() );
		setRequiredName( src.getRequiredName() );
	}
}
