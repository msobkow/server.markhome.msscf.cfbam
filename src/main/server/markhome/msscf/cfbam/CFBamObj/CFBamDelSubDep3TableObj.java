// Description: Java 11 Table Object implementation for CFBam.

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

public class CFBamDelSubDep3TableObj
	implements ICFBamDelSubDep3TableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamDelSubDep3Obj> members;
	private Map<CFBamScopePKey, ICFBamDelSubDep3Obj> allDelSubDep3;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep3Obj > > indexByTenantIdx;
	private Map< CFBamDelDepByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep3Obj > > indexByDefSchemaIdx;
	private Map< CFBamDelDepByDelDepIdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep3Obj > > indexByDelDepIdx;
	private Map< CFBamDelSubDep3ByDelSubDep2IdxKey,
		Map<CFBamScopePKey, ICFBamDelSubDep3Obj > > indexByDelSubDep2Idx;
	private Map< CFBamDelSubDep3ByUNameIdxKey,
		ICFBamDelSubDep3Obj > indexByUNameIdx;
	public static String TABLE_NAME = "DelSubDep3";
	public static String TABLE_DBNAME = "delsubdep3";

	public CFBamDelSubDep3TableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamDelSubDep3Obj>();
		allDelSubDep3 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelSubDep2Idx = null;
		indexByUNameIdx = null;
	}

	public CFBamDelSubDep3TableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamDelSubDep3Obj>();
		allDelSubDep3 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelSubDep2Idx = null;
		indexByUNameIdx = null;
	}

	public ICFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFBamSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( ICFBamSchemaDefObj.class );
	}


	public void minimizeMemory() {
		allDelSubDep3 = null;
		indexByTenantIdx = null;
		indexByDefSchemaIdx = null;
		indexByDelDepIdx = null;
		indexByDelSubDep2Idx = null;
		indexByUNameIdx = null;
		List<ICFBamDelSubDep3Obj> toForget = new LinkedList<ICFBamDelSubDep3Obj>();
		ICFBamDelSubDep3Obj cur = null;
		Iterator<ICFBamDelSubDep3Obj> iter = members.values().iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			toForget.add( cur );
		}
		iter = toForget.iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			cur.forget();
		}
	}
	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamDelSubDep3Obj.
	 */
	public ICFBamDelSubDep3Obj newInstance() {
		ICFBamDelSubDep3Obj inst = new CFBamDelSubDep3Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamDelSubDep3Obj.
	 */
	public ICFBamDelSubDep3EditObj newEditInstance( ICFBamDelSubDep3Obj orig ) {
		ICFBamDelSubDep3EditObj edit = new CFBamDelSubDep3EditObj( orig );
		return( edit );
	}

	public ICFBamDelSubDep3Obj realiseDelSubDep3( ICFBamDelSubDep3Obj Obj ) {
		ICFBamDelSubDep3Obj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamDelSubDep3Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamDelSubDep3Obj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					indexByDelDepIdx.remove( keyDelDepIdx );
				}
			}

			if( indexByDelSubDep2Idx != null ) {
				CFBamDelSubDep3ByDelSubDep2IdxKey keyDelSubDep2Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
				keyDelSubDep2Idx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyDelSubDep2Idx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapDelSubDep2Idx = indexByDelSubDep2Idx.get( keyDelSubDep2Idx );
				if( mapDelSubDep2Idx != null ) {
					mapDelSubDep2Idx.remove( keepObj.getPKey() );
					if( mapDelSubDep2Idx.size() <= 0 ) {
						indexByDelSubDep2Idx.remove( keyDelSubDep2Idx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelSubDep3ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyUNameIdx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFBamDelSubDep3Obj)schema.getDelDepTableObj().realiseDelDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelSubDep2Idx != null ) {
				CFBamDelSubDep3ByDelSubDep2IdxKey keyDelSubDep2Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
				keyDelSubDep2Idx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyDelSubDep2Idx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapDelSubDep2Idx = indexByDelSubDep2Idx.get( keyDelSubDep2Idx );
				if( mapDelSubDep2Idx != null ) {
					mapDelSubDep2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelSubDep3ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyUNameIdx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allDelSubDep3 != null ) {
				allDelSubDep3.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFBamDelSubDep3Obj)schema.getDelDepTableObj().realiseDelDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allDelSubDep3 != null ) {
				allDelSubDep3.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelDepIdx != null ) {
				CFBamDelDepByDelDepIdxKey keyDelDepIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
				keyDelDepIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyDelDepIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapDelDepIdx = indexByDelDepIdx.get( keyDelDepIdx );
				if( mapDelDepIdx != null ) {
					mapDelDepIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDelSubDep2Idx != null ) {
				CFBamDelSubDep3ByDelSubDep2IdxKey keyDelSubDep2Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
				keyDelSubDep2Idx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyDelSubDep2Idx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				Map<CFBamScopePKey, ICFBamDelSubDep3Obj > mapDelSubDep2Idx = indexByDelSubDep2Idx.get( keyDelSubDep2Idx );
				if( mapDelSubDep2Idx != null ) {
					mapDelSubDep2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamDelSubDep3ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredDelSubDep2TenantId( keepObj.getRequiredDelSubDep2TenantId() );
				keyUNameIdx.setRequiredDelSubDep2Id( keepObj.getRequiredDelSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFBamDelSubDep3Obj createDelSubDep3( ICFBamDelSubDep3Obj Obj ) {
		ICFBamDelSubDep3Obj obj = Obj;
		CFBamDelSubDep3Buff buff = obj.getDelSubDep3Buff();
		((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().createDelSubDep3(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a81a" ) ) {
			obj = (ICFBamDelSubDep3Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamDelSubDep3Obj readDelSubDep3( CFBamScopePKey pkey ) {
		return( readDelSubDep3( pkey, false ) );
	}

	public ICFBamDelSubDep3Obj readDelSubDep3( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamDelSubDep3Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamDelSubDep3Buff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamDelSubDep3Obj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamDelSubDep3Obj readCachedDelSubDep3( CFBamScopePKey pkey ) {
		ICFBamDelSubDep3Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeDelSubDep3( ICFBamDelSubDep3Obj obj )
	{
		final String S_ProcName = "CFBamDelSubDep3TableObj.reallyDeepDisposeDelSubDep3() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamDelSubDep3Obj existing = readCachedDelSubDep3( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamDelSubDep3ByDelSubDep2IdxKey keyDelSubDep2Idx = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
		keyDelSubDep2Idx.setRequiredDelSubDep2TenantId( existing.getRequiredDelSubDep2TenantId() );
		keyDelSubDep2Idx.setRequiredDelSubDep2Id( existing.getRequiredDelSubDep2Id() );

		CFBamDelSubDep3ByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
		keyUNameIdx.setRequiredDelSubDep2TenantId( existing.getRequiredDelSubDep2TenantId() );
		keyUNameIdx.setRequiredDelSubDep2Id( existing.getRequiredDelSubDep2Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );



		if( indexByDelSubDep2Idx != null ) {
			if( indexByDelSubDep2Idx.containsKey( keyDelSubDep2Idx ) ) {
				indexByDelSubDep2Idx.get( keyDelSubDep2Idx ).remove( pkey );
				if( indexByDelSubDep2Idx.get( keyDelSubDep2Idx ).size() <= 0 ) {
					indexByDelSubDep2Idx.remove( keyDelSubDep2Idx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getDelDepTableObj().reallyDeepDisposeDelDep( obj );
	}
	public void deepDisposeDelSubDep3( CFBamScopePKey pkey ) {
		ICFBamDelSubDep3Obj obj = readCachedDelSubDep3( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamDelSubDep3Obj lockDelSubDep3( CFBamScopePKey pkey ) {
		ICFBamDelSubDep3Obj locked = null;
		CFBamDelSubDep3Buff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamDelSubDep3Obj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockDelSubDep3", pkey );
		}
		return( locked );
	}

	public List<ICFBamDelSubDep3Obj> readAllDelSubDep3() {
		return( readAllDelSubDep3( false ) );
	}

	public List<ICFBamDelSubDep3Obj> readAllDelSubDep3( boolean forceRead ) {
		final String S_ProcName = "readAllDelSubDep3";
		if( ( allDelSubDep3 == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamDelSubDep3Obj> map = new HashMap<CFBamScopePKey,ICFBamDelSubDep3Obj>();
			allDelSubDep3 = map;
			CFBamDelSubDep3Buff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().readAllDerived( schema.getAuthorization() );
			CFBamDelSubDep3Buff buff;
			ICFBamDelSubDep3Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep3Obj realised = (ICFBamDelSubDep3Obj)obj.realise();
			}
		}
		int len = allDelSubDep3.size();
		ICFBamDelSubDep3Obj arr[] = new ICFBamDelSubDep3Obj[len];
		Iterator<ICFBamDelSubDep3Obj> valIter = allDelSubDep3.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamDelSubDep3Obj> arrayList = new ArrayList<ICFBamDelSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep3Obj> cmp = new Comparator<ICFBamDelSubDep3Obj>() {
			public int compare( ICFBamDelSubDep3Obj lhs, ICFBamDelSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep3Obj> readCachedAllDelSubDep3() {
		final String S_ProcName = "readCachedAllDelSubDep3";
		ArrayList<ICFBamDelSubDep3Obj> arrayList = new ArrayList<ICFBamDelSubDep3Obj>();
		if( allDelSubDep3 != null ) {
			int len = allDelSubDep3.size();
			ICFBamDelSubDep3Obj arr[] = new ICFBamDelSubDep3Obj[len];
			Iterator<ICFBamDelSubDep3Obj> valIter = allDelSubDep3.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
			}
			for( idx = 0; idx < len; idx ++ ) {
				arrayList.add( arr[idx] );
			}
		}
		Comparator<ICFBamDelSubDep3Obj> cmp = new Comparator<ICFBamDelSubDep3Obj>() {
			public int compare( ICFBamDelSubDep3Obj lhs, ICFBamDelSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamDelSubDep3Obj readDelSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		return( readDelSubDep3ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamDelSubDep3Obj readDelSubDep3ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamDelSubDep3Obj obj = readDelSubDep3( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamDelSubDep3Obj> readDelSubDep3ByTenantIdx( long TenantId )
	{
		return( readDelSubDep3ByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamDelSubDep3Obj> readDelSubDep3ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep3ByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep3Obj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep3Obj realised = (ICFBamDelSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep3Obj arr[] = new ICFBamDelSubDep3Obj[len];
		Iterator<ICFBamDelSubDep3Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamDelSubDep3Obj> arrayList = new ArrayList<ICFBamDelSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep3Obj> cmp = new Comparator<ICFBamDelSubDep3Obj>() {
			public int compare( ICFBamDelSubDep3Obj lhs, ICFBamDelSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep3Obj> readDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readDelSubDep3ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamDelSubDep3Obj> readDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep3ByDefSchemaIdx";
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamDelDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep3Obj>();
			ICFBamDelDepObj obj;
			CFBamDelDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep3Obj realised = (ICFBamDelSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep3Obj arr[] = new ICFBamDelSubDep3Obj[len];
		Iterator<ICFBamDelSubDep3Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamDelSubDep3Obj> arrayList = new ArrayList<ICFBamDelSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep3Obj> cmp = new Comparator<ICFBamDelSubDep3Obj>() {
			public int compare( ICFBamDelSubDep3Obj lhs, ICFBamDelSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep3Obj> readDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		return( readDelSubDep3ByDelDepIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<ICFBamDelSubDep3Obj> readDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep3ByDelDepIdx";
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict;
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< CFBamDelDepByDelDepIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByDelDepIdx.containsKey( key ) ) {
			dict = indexByDelDepIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep3Obj>();
			ICFBamDelDepObj obj;
			CFBamDelDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelDep().readDerivedByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			CFBamDelDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep3Obj realised = (ICFBamDelSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelDepIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep3Obj arr[] = new ICFBamDelSubDep3Obj[len];
		Iterator<ICFBamDelSubDep3Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamDelSubDep3Obj> arrayList = new ArrayList<ICFBamDelSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep3Obj> cmp = new Comparator<ICFBamDelSubDep3Obj>() {
			public int compare( ICFBamDelSubDep3Obj lhs, ICFBamDelSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamDelSubDep3Obj> readDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id )
	{
		return( readDelSubDep3ByDelSubDep2Idx( DelSubDep2TenantId,
			DelSubDep2Id,
			false ) );
	}

	public List<ICFBamDelSubDep3Obj> readDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		boolean forceRead )
	{
		final String S_ProcName = "readDelSubDep3ByDelSubDep2Idx";
		CFBamDelSubDep3ByDelSubDep2IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict;
		if( indexByDelSubDep2Idx == null ) {
			indexByDelSubDep2Idx = new HashMap< CFBamDelSubDep3ByDelSubDep2IdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByDelSubDep2Idx.containsKey( key ) ) {
			dict = indexByDelSubDep2Idx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamDelSubDep3Obj>();
			ICFBamDelSubDep3Obj obj;
			CFBamDelSubDep3Buff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().readDerivedByDelSubDep2Idx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id );
			CFBamDelSubDep3Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamDelSubDep3Obj realised = (ICFBamDelSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDelSubDep2Idx.put( key, dict );
		}
		int len = dict.size();
		ICFBamDelSubDep3Obj arr[] = new ICFBamDelSubDep3Obj[len];
		Iterator<ICFBamDelSubDep3Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamDelSubDep3Obj> arrayList = new ArrayList<ICFBamDelSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamDelSubDep3Obj> cmp = new Comparator<ICFBamDelSubDep3Obj>() {
			public int compare( ICFBamDelSubDep3Obj lhs, ICFBamDelSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamDelSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamDelSubDep3Obj readDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name )
	{
		return( readDelSubDep3ByUNameIdx( DelSubDep2TenantId,
			DelSubDep2Id,
			Name,
			false ) );
	}

	public ICFBamDelSubDep3Obj readDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamDelSubDep3ByUNameIdxKey,
				ICFBamDelSubDep3Obj >();
		}
		CFBamDelSubDep3ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		key.setRequiredName( Name );
		ICFBamDelSubDep3Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamDelSubDep3Buff buff = ((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().readDerivedByUNameIdx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id,
				Name );
			if( buff != null ) {
				obj = (ICFBamDelSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamDelSubDep3Obj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamDelSubDep3Obj readCachedDelSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		ICFBamDelSubDep3Obj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedDelSubDep3( pkey );
		return( obj );
	}

	public List<ICFBamDelSubDep3Obj> readCachedDelSubDep3ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedDelSubDep3ByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamDelSubDep3Obj> arrayList = new ArrayList<ICFBamDelSubDep3Obj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamDelSubDep3Obj arr[] = new ICFBamDelSubDep3Obj[len];
				Iterator<ICFBamDelSubDep3Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamDelSubDep3Obj obj;
			Iterator<ICFBamDelSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep3Obj> cmp = new Comparator<ICFBamDelSubDep3Obj>() {
			public int compare( ICFBamDelSubDep3Obj lhs, ICFBamDelSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamDelSubDep3Obj> readCachedDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedDelSubDep3ByDefSchemaIdx";
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamDelSubDep3Obj> arrayList = new ArrayList<ICFBamDelSubDep3Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamDelSubDep3Obj arr[] = new ICFBamDelSubDep3Obj[len];
				Iterator<ICFBamDelSubDep3Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamDelSubDep3Obj obj;
			Iterator<ICFBamDelSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep3Obj> cmp = new Comparator<ICFBamDelSubDep3Obj>() {
			public int compare( ICFBamDelSubDep3Obj lhs, ICFBamDelSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamDelSubDep3Obj> readCachedDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedDelSubDep3ByDelDepIdx";
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<ICFBamDelSubDep3Obj> arrayList = new ArrayList<ICFBamDelSubDep3Obj>();
		if( indexByDelDepIdx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict;
			if( indexByDelDepIdx.containsKey( key ) ) {
				dict = indexByDelDepIdx.get( key );
				int len = dict.size();
				ICFBamDelSubDep3Obj arr[] = new ICFBamDelSubDep3Obj[len];
				Iterator<ICFBamDelSubDep3Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamDelSubDep3Obj obj;
			Iterator<ICFBamDelSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep3Obj> cmp = new Comparator<ICFBamDelSubDep3Obj>() {
			public int compare( ICFBamDelSubDep3Obj lhs, ICFBamDelSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamDelSubDep3Obj> readCachedDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id )
	{
		final String S_ProcName = "readCachedDelSubDep3ByDelSubDep2Idx";
		CFBamDelSubDep3ByDelSubDep2IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		ArrayList<ICFBamDelSubDep3Obj> arrayList = new ArrayList<ICFBamDelSubDep3Obj>();
		if( indexByDelSubDep2Idx != null ) {
			Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict;
			if( indexByDelSubDep2Idx.containsKey( key ) ) {
				dict = indexByDelSubDep2Idx.get( key );
				int len = dict.size();
				ICFBamDelSubDep3Obj arr[] = new ICFBamDelSubDep3Obj[len];
				Iterator<ICFBamDelSubDep3Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamDelSubDep3Obj obj;
			Iterator<ICFBamDelSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamDelSubDep3Obj> cmp = new Comparator<ICFBamDelSubDep3Obj>() {
			public int compare( ICFBamDelSubDep3Obj lhs, ICFBamDelSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamDelSubDep3Obj readCachedDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name )
	{
		ICFBamDelSubDep3Obj obj = null;
		CFBamDelSubDep3ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamDelSubDep3Obj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<ICFBamDelSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public void deepDisposeDelSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		ICFBamDelSubDep3Obj obj = readCachedDelSubDep3ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeDelSubDep3ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeDelSubDep3ByTenantIdx";
		ICFBamDelSubDep3Obj obj;
		List<ICFBamDelSubDep3Obj> arrayList = readCachedDelSubDep3ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeDelSubDep3ByDefSchemaIdx";
		ICFBamDelSubDep3Obj obj;
		List<ICFBamDelSubDep3Obj> arrayList = readCachedDelSubDep3ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposeDelSubDep3ByDelDepIdx";
		ICFBamDelSubDep3Obj obj;
		List<ICFBamDelSubDep3Obj> arrayList = readCachedDelSubDep3ByDelDepIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id )
	{
		final String S_ProcName = "deepDisposeDelSubDep3ByDelSubDep2Idx";
		ICFBamDelSubDep3Obj obj;
		List<ICFBamDelSubDep3Obj> arrayList = readCachedDelSubDep3ByDelSubDep2Idx( DelSubDep2TenantId,
				DelSubDep2Id );
		if( arrayList != null )  {
			Iterator<ICFBamDelSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name )
	{
		ICFBamDelSubDep3Obj obj = readCachedDelSubDep3ByUNameIdx( DelSubDep2TenantId,
				DelSubDep2Id,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamDelSubDep3Obj updateDelSubDep3( ICFBamDelSubDep3Obj Obj ) {
		ICFBamDelSubDep3Obj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().updateDelSubDep3( schema.getAuthorization(),
			Obj.getDelSubDep3Buff() );
		if( Obj.getClassCode().equals( "a81a" ) ) {
			obj = (ICFBamDelSubDep3Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteDelSubDep3( ICFBamDelSubDep3Obj Obj ) {
		ICFBamDelSubDep3Obj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3( schema.getAuthorization(),
			obj.getDelSubDep3Buff() );
		Obj.forget();
	}

	public void deleteDelSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamDelSubDep3Obj obj = readDelSubDep3( pkey );
		if( obj != null ) {
			ICFBamDelSubDep3EditObj editObj = (ICFBamDelSubDep3EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamDelSubDep3EditObj)obj.beginEdit();
				if( editObj != null ) {
					editStarted = true;
				}
				else {
					editStarted = false;
				}
			}
			else {
				editStarted = false;
			}
			if( editObj != null ) {
				editObj.deleteInstance();
				if( editStarted ) {
					editObj.endEdit();
				}
			}
			obj.forget();
		}
		deepDisposeDelSubDep3ByIdIdx( TenantId,
				Id );
	}

	public void deleteDelSubDep3ByTenantIdx( long TenantId )
	{
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep3Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamDelSubDep3Obj> iter = dict.values().iterator();
			ICFBamDelSubDep3Obj obj;
			List<ICFBamDelSubDep3Obj> toForget = new LinkedList<ICFBamDelSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeDelSubDep3ByTenantIdx( TenantId );
	}

	public void deleteDelSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamDelDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamDelDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep3Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamDelSubDep3Obj> iter = dict.values().iterator();
			ICFBamDelSubDep3Obj obj;
			List<ICFBamDelSubDep3Obj> toForget = new LinkedList<ICFBamDelSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDefSchemaIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeDelSubDep3ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteDelSubDep3ByDelDepIdx( long RelationTenantId,
		long RelationId )
	{
		CFBamDelDepByDelDepIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByDelDepIdx == null ) {
			indexByDelDepIdx = new HashMap< CFBamDelDepByDelDepIdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep3Obj > >();
		}
		if( indexByDelDepIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict = indexByDelDepIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<ICFBamDelSubDep3Obj> iter = dict.values().iterator();
			ICFBamDelSubDep3Obj obj;
			List<ICFBamDelSubDep3Obj> toForget = new LinkedList<ICFBamDelSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDelDepIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDelDepIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposeDelSubDep3ByDelDepIdx( RelationTenantId,
				RelationId );
	}

	public void deleteDelSubDep3ByDelSubDep2Idx( long DelSubDep2TenantId,
		long DelSubDep2Id )
	{
		CFBamDelSubDep3ByDelSubDep2IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newDelSubDep2IdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		if( indexByDelSubDep2Idx == null ) {
			indexByDelSubDep2Idx = new HashMap< CFBamDelSubDep3ByDelSubDep2IdxKey,
				Map< CFBamScopePKey, ICFBamDelSubDep3Obj > >();
		}
		if( indexByDelSubDep2Idx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamDelSubDep3Obj> dict = indexByDelSubDep2Idx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDelSubDep2Idx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id );
			Iterator<ICFBamDelSubDep3Obj> iter = dict.values().iterator();
			ICFBamDelSubDep3Obj obj;
			List<ICFBamDelSubDep3Obj> toForget = new LinkedList<ICFBamDelSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDelSubDep2Idx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByDelSubDep2Idx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id );
		}
		deepDisposeDelSubDep3ByDelSubDep2Idx( DelSubDep2TenantId,
				DelSubDep2Id );
	}

	public void deleteDelSubDep3ByUNameIdx( long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamDelSubDep3ByUNameIdxKey,
				ICFBamDelSubDep3Obj >();
		}
		CFBamDelSubDep3ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryDelSubDep3().newUNameIdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		key.setRequiredName( Name );
		ICFBamDelSubDep3Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByUNameIdx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableDelSubDep3().deleteDelSubDep3ByUNameIdx( schema.getAuthorization(),
				DelSubDep2TenantId,
				DelSubDep2Id,
				Name );
		}
		deepDisposeDelSubDep3ByUNameIdx( DelSubDep2TenantId,
				DelSubDep2Id,
				Name );
	}
}