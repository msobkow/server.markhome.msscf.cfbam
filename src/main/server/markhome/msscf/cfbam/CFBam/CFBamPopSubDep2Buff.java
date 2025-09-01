// Description: Java 11 implementation of a PopSubDep2 buffer object.

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

public class CFBamPopSubDep2Buff
	extends CFBamPopDepBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a832";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long POPSUBDEP1TENANTID_INIT_VALUE = 0L;
	public static final long POPSUBDEP1ID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long POPSUBDEP1TENANTID_MIN_VALUE = 0L;
	public static final long POPSUBDEP1ID_MIN_VALUE = 0L;
	protected long requiredPopSubDep1TenantId;
	protected long requiredPopSubDep1Id;
	protected String requiredName;
	public CFBamPopSubDep2Buff() {
		super();
		requiredPopSubDep1TenantId = CFBamPopSubDep2Buff.POPSUBDEP1TENANTID_INIT_VALUE;
		requiredPopSubDep1Id = CFBamPopSubDep2Buff.POPSUBDEP1ID_INIT_VALUE;
		requiredName = new String( CFBamPopSubDep2Buff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredPopSubDep1TenantId() {
		return( requiredPopSubDep1TenantId );
	}

	public void setRequiredPopSubDep1TenantId( long value ) {
		if( value < CFBamPopSubDep2Buff.POPSUBDEP1TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredPopSubDep1TenantId",
				1,
				"value",
				value,
				CFBamPopSubDep2Buff.POPSUBDEP1TENANTID_MIN_VALUE );
		}
		requiredPopSubDep1TenantId = value;
	}

	public long getRequiredPopSubDep1Id() {
		return( requiredPopSubDep1Id );
	}

	public void setRequiredPopSubDep1Id( long value ) {
		if( value < CFBamPopSubDep2Buff.POPSUBDEP1ID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredPopSubDep1Id",
				1,
				"value",
				value,
				CFBamPopSubDep2Buff.POPSUBDEP1ID_MIN_VALUE );
		}
		requiredPopSubDep1Id = value;
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
		else if( obj instanceof CFBamPopSubDep2Buff ) {
			CFBamPopSubDep2Buff rhs = (CFBamPopSubDep2Buff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredPopSubDep1TenantId() != rhs.getRequiredPopSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredPopSubDep1Id() != rhs.getRequiredPopSubDep1Id() ) {
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
		else if( obj instanceof CFBamPopSubDep2HBuff ) {
			CFBamPopSubDep2HBuff rhs = (CFBamPopSubDep2HBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredPopSubDep1TenantId() != rhs.getRequiredPopSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredPopSubDep1Id() != rhs.getRequiredPopSubDep1Id() ) {
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
		else if( obj instanceof CFBamPopSubDep2ByPopSubDep1IdxKey ) {
			CFBamPopSubDep2ByPopSubDep1IdxKey rhs = (CFBamPopSubDep2ByPopSubDep1IdxKey)obj;
			if( getRequiredPopSubDep1TenantId() != rhs.getRequiredPopSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredPopSubDep1Id() != rhs.getRequiredPopSubDep1Id() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopSubDep2ByUNameIdxKey ) {
			CFBamPopSubDep2ByUNameIdxKey rhs = (CFBamPopSubDep2ByUNameIdxKey)obj;
			if( getRequiredPopSubDep1TenantId() != rhs.getRequiredPopSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredPopSubDep1Id() != rhs.getRequiredPopSubDep1Id() ) {
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
		hashCode = hashCode + (int)( getRequiredPopSubDep1TenantId() );
		hashCode = hashCode + (int)( getRequiredPopSubDep1Id() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamPopSubDep2Buff ) {
			CFBamPopSubDep2Buff rhs = (CFBamPopSubDep2Buff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredPopSubDep1TenantId() < rhs.getRequiredPopSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep1TenantId() > rhs.getRequiredPopSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredPopSubDep1Id() < rhs.getRequiredPopSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep1Id() > rhs.getRequiredPopSubDep1Id() ) {
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
		else if( obj instanceof CFBamPopSubDep2HBuff ) {
			CFBamPopSubDep2HBuff rhs = (CFBamPopSubDep2HBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredPopSubDep1TenantId() < rhs.getRequiredPopSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep1TenantId() > rhs.getRequiredPopSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredPopSubDep1Id() < rhs.getRequiredPopSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep1Id() > rhs.getRequiredPopSubDep1Id() ) {
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
		else if( obj instanceof CFBamPopSubDep2ByPopSubDep1IdxKey ) {
			CFBamPopSubDep2ByPopSubDep1IdxKey rhs = (CFBamPopSubDep2ByPopSubDep1IdxKey)obj;

			if( getRequiredPopSubDep1TenantId() < rhs.getRequiredPopSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep1TenantId() > rhs.getRequiredPopSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredPopSubDep1Id() < rhs.getRequiredPopSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep1Id() > rhs.getRequiredPopSubDep1Id() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof CFBamPopSubDep2ByUNameIdxKey ) {
			CFBamPopSubDep2ByUNameIdxKey rhs = (CFBamPopSubDep2ByUNameIdxKey)obj;

			if( getRequiredPopSubDep1TenantId() < rhs.getRequiredPopSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep1TenantId() > rhs.getRequiredPopSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredPopSubDep1Id() < rhs.getRequiredPopSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep1Id() > rhs.getRequiredPopSubDep1Id() ) {
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
		if( src instanceof CFBamPopSubDep2Buff ) {
			setPopSubDep2Buff( (CFBamPopSubDep2Buff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamPopSubDep2Buff" );
		}
	}

	public void setPopSubDep2Buff( CFBamPopSubDep2Buff src ) {
		super.setPopDepBuff( src );
		setRequiredPopSubDep1TenantId( src.getRequiredPopSubDep1TenantId() );
		setRequiredPopSubDep1Id( src.getRequiredPopSubDep1Id() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( CFBamScopeHBuff src ) {
		if( src instanceof CFBamPopSubDep2HBuff ) {
			setPopSubDep2Buff( (CFBamPopSubDep2HBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamPopSubDep2HBuff" );
		}
	}

	public void setPopSubDep2Buff( CFBamPopSubDep2HBuff src ) {
		super.setPopDepBuff( src );
		setRequiredPopSubDep1TenantId( src.getRequiredPopSubDep1TenantId() );
		setRequiredPopSubDep1Id( src.getRequiredPopSubDep1Id() );
		setRequiredName( src.getRequiredName() );
	}
}
