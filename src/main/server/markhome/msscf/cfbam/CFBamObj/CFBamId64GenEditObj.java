// Description: Java 11 edit object instance implementation for CFBam Id64Gen.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public class CFBamId64GenEditObj
	extends CFBamInt64TypeEditObj

	implements ICFBamId64GenEditObj
{
	protected ICFBamTableObj optionalLookupDispenser;

	public CFBamId64GenEditObj( ICFBamId64GenObj argOrig ) {
		super( argOrig );
		optionalLookupDispenser = null;
	}

	public String getClassCode() {
		return( CFBamId64GenObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Id64Gen" );
	}

	public ICFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public ICFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof ICFBamSchemaDefObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public ICFBamValueObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamId64GenObj retobj = getSchema().getId64GenTableObj().realiseId64Gen( (ICFBamId64GenObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsId64Gen().forget();
	}

	public ICFBamValueObj moveUp() {
		throw new CFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj moveDown() {
		throw new CFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj create() {
		copyBuffToOrig();
		ICFBamId64GenObj retobj = ((ICFBamSchemaObj)getOrigAsId64Gen().getSchema()).getId64GenTableObj().createId64Gen( getOrigAsId64Gen() );
		if( retobj == getOrigAsId64Gen() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getId64GenTableObj().updateId64Gen( (ICFBamId64GenObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getId64GenTableObj().deleteId64Gen( getOrigAsId64Gen() );
		return( null );
	}

	public ICFBamId64GenTableObj getId64GenTable() {
		return( orig.getSchema().getId64GenTableObj() );
	}

	public ICFBamId64GenEditObj getEditAsId64Gen() {
		return( (ICFBamId64GenEditObj)this );
	}

	public ICFBamId64GenObj getOrigAsId64Gen() {
		return( (ICFBamId64GenObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsId64Gen().getSchema().getBackingStore()).getFactoryId64Gen().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupDispenser = null;
		}
	}

	public CFBamId64GenBuff getId64GenBuff() {
		return( (CFBamId64GenBuff)getBuff() );
	}

	public Long getOptionalDispenserTenantId() {
		return( getId64GenBuff().getOptionalDispenserTenantId() );
	}

	public Long getOptionalDispenserId() {
		return( getId64GenBuff().getOptionalDispenserId() );
	}

	public short getRequiredSlice() {
		return( getId64GenBuff().getRequiredSlice() );
	}

	public void setRequiredSlice( short value ) {
		if( getId64GenBuff().getRequiredSlice() != value ) {
			getId64GenBuff().setRequiredSlice( value );
		}
	}

	public long getRequiredBlockSize() {
		return( getId64GenBuff().getRequiredBlockSize() );
	}

	public void setRequiredBlockSize( long value ) {
		if( getId64GenBuff().getRequiredBlockSize() != value ) {
			getId64GenBuff().setRequiredBlockSize( value );
		}
	}

	public ICFBamTableObj getOptionalLookupDispenser() {
		return( getOptionalLookupDispenser( false ) );
	}

	public ICFBamTableObj getOptionalLookupDispenser( boolean forceRead ) {
		if( forceRead || ( optionalLookupDispenser == null ) ) {
			boolean anyMissing = false;
			if( getId64GenBuff().getOptionalDispenserTenantId() == null ) {
				anyMissing = true;
			}
			if( getId64GenBuff().getOptionalDispenserId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsId64Gen().getSchema()).getTableTableObj().readTableByIdIdx( getId64GenBuff().getOptionalDispenserTenantId(),
					getId64GenBuff().getOptionalDispenserId() );
				optionalLookupDispenser = obj;
			}
		}
		return( optionalLookupDispenser );
	}

	public void setOptionalLookupDispenser( ICFBamTableObj value ) {
			if( buff == null ) {
				getId64GenBuff();
			}
			if( value != null ) {
				getId64GenBuff().setOptionalDispenserTenantId( value.getRequiredTenantId() );
				getId64GenBuff().setOptionalDispenserId( value.getRequiredId() );
			}
			else {
				getId64GenBuff().setOptionalDispenserTenantId( null );
				getId64GenBuff().setOptionalDispenserId( null );
			}
			optionalLookupDispenser = value;
	}

	public void copyBuffToOrig() {
		CFBamId64GenBuff origBuff = getOrigAsId64Gen().getId64GenBuff();
		CFBamId64GenBuff myBuff = getId64GenBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamId64GenBuff origBuff = getOrigAsId64Gen().getId64GenBuff();
		CFBamId64GenBuff myBuff = getId64GenBuff();
		myBuff.set( origBuff );
	}
}
