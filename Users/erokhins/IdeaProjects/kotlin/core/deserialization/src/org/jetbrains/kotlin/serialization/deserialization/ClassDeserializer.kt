'components' @ [28:13] ==> private final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[PropertyDescriptorImpl]

'storageManager' @ [28:24] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [28:39] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (ClassDeserializer.ClassKey) -> ClassDescriptor?): MemoizedFunctionToNullable<ClassDeserializer.ClassKey, ClassDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> ClassKey
    <V : Any> -> ClassDescriptor

'createClass' @ [28:89] ==> private final fun createClass(key: ClassDeserializer.ClassKey): ClassDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[SimpleFunctionDescriptorImpl]

'key' @ [28:101] ==> value-parameter key: ClassDeserializer.ClassKey defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.classes.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [33:13] ==> public abstract operator fun invoke(p1: ClassDeserializer.ClassKey): ClassDescriptor? defined in kotlin.Function1[FunctionInvokeDescriptor]

'ClassKey' @ [33:21] ==> public constructor ClassKey(classId: ClassId, classDataWithSource: ClassDataWithSource?) defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.ClassKey[ClassConstructorDescriptorImpl]

'classId' @ [33:30] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.deserializeClass[ValueParameterDescriptorImpl]

'classDataWithSource' @ [33:39] ==> value-parameter classDataWithSource: ClassDataWithSource? = ... defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.deserializeClass[ValueParameterDescriptorImpl]

'key' @ [36:23] ==> value-parameter key: ClassDeserializer.ClassKey defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[ValueParameterDescriptorImpl]

'classId' @ [36:27] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.ClassKey[PropertyDescriptorImpl]

'components' @ [37:25] ==> private final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[PropertyDescriptorImpl]

'fictitiousClassDescriptorFactories' @ [37:36] ==> public final val fictitiousClassDescriptorFactories: Iterable<ClassDescriptorFactory> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'factory' @ [38:13] ==> val factory: ClassDescriptorFactory defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'createClass' @ [38:21] ==> public abstract fun createClass(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.deserialization.ClassDescriptorFactory[SimpleFunctionDescriptorImpl]

'classId' @ [38:33] ==> val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'let' @ [38:43] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> Nothing

'it' @ [38:56] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass.<anonymous>[ValueParameterDescriptorImpl]

'classId' @ [40:13] ==> val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'BLACK_LIST' @ [40:24] ==> public final val BLACK_LIST: Set<ClassId> defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.Companion[PropertyDescriptorImpl]

'component1' @ [42:14] ==> public final operator fun component1(): ClassData defined in org.jetbrains.kotlin.serialization.ClassDataWithSource[SimpleFunctionDescriptorImpl]

'component2' @ [42:25] ==> public final operator fun component2(): SourceElement defined in org.jetbrains.kotlin.serialization.ClassDataWithSource[SimpleFunctionDescriptorImpl]

'key' @ [42:42] ==> value-parameter key: ClassDeserializer.ClassKey defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[ValueParameterDescriptorImpl]

'classDataWithSource' @ [42:46] ==> public final val classDataWithSource: ClassDataWithSource? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.ClassKey[PropertyDescriptorImpl]

'components' @ [43:45] ==> private final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[PropertyDescriptorImpl]

'classDataFinder' @ [43:56] ==> public final val classDataFinder: ClassDataFinder defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'findClassData' @ [43:72] ==> @Nullable public abstract fun findClassData(@NotNull classId: ClassId): ClassDataWithSource? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDataFinder[JavaMethodDescriptor]

'classId' @ [43:86] ==> val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'component1' @ [45:14] ==> public final operator fun component1(): NameResolver defined in org.jetbrains.kotlin.serialization.ClassData[SimpleFunctionDescriptorImpl]

'component2' @ [45:28] ==> public final operator fun component2(): ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.ClassData[SimpleFunctionDescriptorImpl]

'classData' @ [45:42] ==> val classData: ClassData defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'classId' @ [47:28] ==> val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'outerClassId' @ [47:36] ==> public final val ClassId.outerClassId: ClassId?[MyPropertyDescriptor]

'if (outerClassId != null) {
            val outerClass = deserializeClass(outerClassId) as? DeserializedClassDescriptor ?: return null

            // Find the outer class first and check if he knows anything about the nested class we're looking for
            if (!outerClass.hasNestedClass(classId.shortClassName)) return null

            outerClass.c
        }
        else {
            val fragments = components.packageFragmentProvider.getPackageFragments(classId.packageFqName)
            assert(fragments.size == 1) { "There should be exactly one package: $fragments, class id is $classId" }

            val fragment = fragments.single()
            if (fragment is DeserializedPackageFragment) {
                // Similarly, verify that the containing package has information about this class
                if (!fragment.hasTopLevelClass(classId.shortClassName)) return null
            }

            components.createContext(
                    fragment, nameResolver,
                    TypeTable(classProto.typeTable),
                    SinceKotlinInfoTable.create(classProto.sinceKotlinInfoTable),
                    containerSource = null
            )
        }' @ [48:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeserializationContext, elseBranch: DeserializationContext): DeserializationContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeserializationContext

'outerClassId' @ [48:32] ==> val outerClassId: ClassId? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'deserializeClass' @ [49:30] ==> public final fun deserializeClass(classId: ClassId, classDataWithSource: ClassDataWithSource? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[SimpleFunctionDescriptorImpl]

'outerClassId' @ [49:47] ==> val outerClassId: ClassId? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'!' @ [52:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'outerClass' @ [52:18] ==> val outerClass: DeserializedClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'hasNestedClass' @ [52:29] ==> internal final fun hasNestedClass(name: Name): Boolean defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor[SimpleFunctionDescriptorImpl]

'classId' @ [52:44] ==> val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'shortClassName' @ [52:52] ==> public final val ClassId.shortClassName: Name[MyPropertyDescriptor]

'outerClass' @ [54:13] ==> val outerClass: DeserializedClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'c' @ [54:24] ==> public final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor[PropertyDescriptorImpl]

'components' @ [57:29] ==> private final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[PropertyDescriptorImpl]

'packageFragmentProvider' @ [57:40] ==> public final val packageFragmentProvider: PackageFragmentProvider defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'getPackageFragments' @ [57:64] ==> public abstract fun getPackageFragments(fqName: FqName): List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.PackageFragmentProvider[SimpleFunctionDescriptorImpl]

'classId' @ [57:84] ==> val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'packageFqName' @ [57:92] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'assert' @ [58:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'fragments' @ [58:20] ==> val fragments: List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'size' @ [58:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'fragments' @ [58:82] ==> val fragments: List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'classId' @ [58:106] ==> val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'fragments' @ [60:28] ==> val fragments: List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'single' @ [60:38] ==> public fun <T> List<PackageFragmentDescriptor>.single(): PackageFragmentDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'fragment' @ [61:17] ==> val fragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'!' @ [63:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fragment' @ [63:22] ==> val fragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'hasTopLevelClass' @ [63:31] ==> public open fun hasTopLevelClass(name: Name): Boolean defined in org.jetbrains.kotlin.serialization.deserialization.DeserializedPackageFragment[SimpleFunctionDescriptorImpl]

'classId' @ [63:48] ==> val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'shortClassName' @ [63:56] ==> public final val ClassId.shortClassName: Name[MyPropertyDescriptor]

'components' @ [66:13] ==> private final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[PropertyDescriptorImpl]

'createContext' @ [66:24] ==> public final fun createContext(descriptor: PackageFragmentDescriptor, nameResolver: NameResolver, typeTable: TypeTable, sinceKotlinInfoTable: SinceKotlinInfoTable, containerSource: DeserializedContainerSource?): DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[SimpleFunctionDescriptorImpl]

'fragment' @ [67:21] ==> val fragment: PackageFragmentDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'nameResolver' @ [67:31] ==> val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'TypeTable' @ [68:21] ==> public constructor TypeTable(typeTable: ProtoBuf.TypeTable) defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable[ClassConstructorDescriptorImpl]

'classProto' @ [68:31] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'typeTable' @ [68:42] ==> public final val ProtoBuf.Class.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'create' @ [69:42] ==> public final fun create(table: ProtoBuf.SinceKotlinInfoTable): SinceKotlinInfoTable defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.SinceKotlinInfoTable.Companion[SimpleFunctionDescriptorImpl]

'classProto' @ [69:49] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'sinceKotlinInfoTable' @ [69:60] ==> public final val ProtoBuf.Class.sinceKotlinInfoTable: (ProtoBuf.SinceKotlinInfoTable..ProtoBuf.SinceKotlinInfoTable?)[MyPropertyDescriptor]

'DeserializedClassDescriptor' @ [74:16] ==> public constructor DeserializedClassDescriptor(outerContext: DeserializationContext, classProto: ProtoBuf.Class, nameResolver: NameResolver, sourceElement: SourceElement) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor[ClassConstructorDescriptorImpl]

'outerContext' @ [74:44] ==> val outerContext: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'classProto' @ [74:58] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'nameResolver' @ [74:70] ==> val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'sourceElement' @ [74:84] ==> val sourceElement: SourceElement defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.createClass[LocalVariableDescriptor]

'other' @ [79:44] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.ClassKey.equals[ValueParameterDescriptorImpl]

'classId' @ [79:65] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.ClassKey[PropertyDescriptorImpl]

'other' @ [79:76] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.ClassKey.equals[ValueParameterDescriptorImpl]

'classId' @ [79:82] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.ClassKey[PropertyDescriptorImpl]

'classId' @ [81:35] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer.ClassKey[PropertyDescriptorImpl]

'hashCode' @ [81:43] ==> @Override public open fun hashCode(): Int defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'setOf' @ [91:26] ==> public fun <T> setOf(element: ClassId): Set<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'topLevel' @ [92:25] ==> @NotNull public open fun topLevel(@NotNull topLevelFqName: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FQ_NAMES' @ [92:49] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'cloneable' @ [92:58] ==> public final val cloneable: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'toSafe' @ [92:68] ==> @NotNull public open fun toSafe(): FqName defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

