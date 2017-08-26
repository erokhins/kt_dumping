'storageManager' @ [42:27] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.<init>[ValueParameterDescriptorImpl]

'createMemoizedFunction' @ [42:42] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (KotlinJvmBinaryClass) -> AbstractBinaryClassAnnotationAndConstantLoader.Storage<A, C>): MemoizedFunctionToNotNull<KotlinJvmBinaryClass, AbstractBinaryClassAnnotationAndConstantLoader.Storage<A, C>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KotlinJvmBinaryClass
    <V : Any> -> Storage<A, C>

'loadAnnotationsAndInitializers' @ [44:9] ==> private final fun loadAnnotationsAndInitializers(kotlinClass: KotlinJvmBinaryClass): AbstractBinaryClassAnnotationAndConstantLoader.Storage<A, C> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [44:40] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.storage.<anonymous>[ValueParameterDescriptorImpl]

'annotationClassId' @ [62:13] ==> value-parameter annotationClassId: ClassId defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationIfNotSpecial[ValueParameterDescriptorImpl]

'SPECIAL_ANNOTATIONS' @ [62:34] ==> public final val SPECIAL_ANNOTATIONS: Set<ClassId> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Companion[PropertyDescriptorImpl]

'loadAnnotation' @ [64:16] ==> protected abstract fun loadAnnotation(annotationClassId: ClassId, source: SourceElement, result: MutableList<A>): KotlinJvmBinaryClass.AnnotationArgumentVisitor? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'annotationClassId' @ [64:31] ==> value-parameter annotationClassId: ClassId defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationIfNotSpecial[ValueParameterDescriptorImpl]

'source' @ [64:50] ==> value-parameter source: SourceElement defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationIfNotSpecial[ValueParameterDescriptorImpl]

'result' @ [64:58] ==> value-parameter result: MutableList<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationIfNotSpecial[ValueParameterDescriptorImpl]

'source' @ [68:14] ==> public final val source: SourceElement? defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'binaryClass' @ [68:56] ==> public final val binaryClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinarySourceElement[PropertyDescriptorImpl]

'container' @ [73:27] ==> value-parameter container: ProtoContainer.Class defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadClassAnnotations[ValueParameterDescriptorImpl]

'toBinaryClass' @ [73:37] ==> private final fun ProtoContainer.Class.toBinaryClass(): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'error' @ [73:56] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'container' @ [73:109] ==> value-parameter container: ProtoContainer.Class defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadClassAnnotations[ValueParameterDescriptorImpl]

'debugFqName' @ [73:119] ==> public open fun debugFqName(): FqName defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [75:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A

'kotlinClass' @ [77:9] ==> val kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadClassAnnotations[LocalVariableDescriptor]

'loadClassAnnotations' @ [77:21] ==> public abstract fun loadClassAnnotations(visitor: KotlinJvmBinaryClass.AnnotationVisitor, cachedContents: ByteArray?): Unit defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[SimpleFunctionDescriptorImpl]

'loadAnnotationIfNotSpecial' @ [79:24] ==> private final fun loadAnnotationIfNotSpecial(annotationClassId: ClassId, source: SourceElement, result: MutableList<A>): KotlinJvmBinaryClass.AnnotationArgumentVisitor? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'classId' @ [79:51] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadClassAnnotations.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'source' @ [79:60] ==> value-parameter source: SourceElement defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadClassAnnotations.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'result' @ [79:68] ==> val result: ArrayList<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadClassAnnotations[LocalVariableDescriptor]

'getCachedFileContent' @ [84:12] ==> protected open fun getCachedFileContent(kotlinClass: KotlinJvmBinaryClass): ByteArray? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [84:33] ==> val kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadClassAnnotations[LocalVariableDescriptor]

'result' @ [86:16] ==> val result: ArrayList<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadClassAnnotations[LocalVariableDescriptor]

'kind' @ [90:13] ==> value-parameter kind: AnnotatedCallableKind defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'PROPERTY' @ [90:43] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'proto' @ [91:13] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'getPropertySignature' @ [93:46] ==> private final fun getPropertySignature(proto: ProtoBuf.Property, nameResolver: NameResolver, typeTable: TypeTable, field: Boolean = ..., synthetic: Boolean = ...): MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'proto' @ [93:67] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'container' @ [93:74] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [93:84] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'container' @ [93:98] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'typeTable' @ [93:108] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'getPropertySignature' @ [94:34] ==> private final fun getPropertySignature(proto: ProtoBuf.Property, nameResolver: NameResolver, typeTable: TypeTable, field: Boolean = ..., synthetic: Boolean = ...): MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'proto' @ [94:55] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'container' @ [94:62] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [94:72] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'container' @ [94:86] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'typeTable' @ [94:96] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'IS_CONST' @ [96:33] ==> public final val IS_CONST: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [96:42] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'proto' @ [96:46] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'flags' @ [96:52] ==> public final val ProtoBuf.Property.flags: Int[MyPropertyDescriptor]

'syntheticFunctionSignature' @ [98:39] ==> val syntheticFunctionSignature: MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[LocalVariableDescriptor]

'let' @ [98:67] ==> @InlineOnly public inline fun <T, R> MemberSignature.let(block: (MemberSignature) -> List<A>): List<A> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberSignature
    <R> -> List<A>

'findClassAndLoadMemberAnnotations' @ [99:17] ==> private final fun findClassAndLoadMemberAnnotations(container: ProtoContainer, signature: MemberSignature, property: Boolean = ..., field: Boolean = ..., isConst: Boolean? = ...): List<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [99:51] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'sig' @ [99:62] ==> value-parameter sig: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'isConst' @ [99:94] ==> val isConst: Boolean defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[LocalVariableDescriptor]

'orEmpty' @ [100:15] ==> @InlineOnly public inline fun <T> List<A>?.orEmpty(): List<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'fieldSignature' @ [102:36] ==> val fieldSignature: MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[LocalVariableDescriptor]

'let' @ [102:52] ==> @InlineOnly public inline fun <T, R> MemberSignature.let(block: (MemberSignature) -> List<A>): List<A> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberSignature
    <R> -> List<A>

'findClassAndLoadMemberAnnotations' @ [103:17] ==> private final fun findClassAndLoadMemberAnnotations(container: ProtoContainer, signature: MemberSignature, property: Boolean = ..., field: Boolean = ..., isConst: Boolean? = ...): List<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [103:51] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'sig' @ [103:62] ==> value-parameter sig: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'isConst' @ [103:108] ==> val isConst: Boolean defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[LocalVariableDescriptor]

'orEmpty' @ [104:15] ==> @InlineOnly public inline fun <T> List<A>?.orEmpty(): List<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'loadPropertyAnnotations' @ [107:20] ==> protected abstract fun loadPropertyAnnotations(propertyAnnotations: List<A>, fieldAnnotations: List<A>, fieldUseSiteTarget: AnnotationUseSiteTarget): List<T> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'propertyAnnotations' @ [107:44] ==> val propertyAnnotations: List<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[LocalVariableDescriptor]

'fieldAnnotations' @ [107:65] ==> val fieldAnnotations: List<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[LocalVariableDescriptor]

'if (fieldSignature?.signature?.contains(JvmAbi.DELEGATED_PROPERTY_NAME_SUFFIX) ?: false) {
                                               AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD
                                           }
                                           else {
                                               AnnotationUseSiteTarget.FIELD
                                           }' @ [108:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnnotationUseSiteTarget, elseBranch: AnnotationUseSiteTarget): AnnotationUseSiteTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnnotationUseSiteTarget

'fieldSignature' @ [108:48] ==> val fieldSignature: MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[LocalVariableDescriptor]

'signature' @ [108:64] ==> internal final val signature: String defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[PropertyDescriptorImpl]

'contains' @ [108:75] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DELEGATED_PROPERTY_NAME_SUFFIX' @ [108:91] ==> public const final val DELEGATED_PROPERTY_NAME_SUFFIX: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'AnnotationUseSiteTarget' @ [109:48] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PROPERTY_DELEGATE_FIELD' @ [109:72] ==> enum entry PROPERTY_DELEGATE_FIELD defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'AnnotationUseSiteTarget' @ [112:48] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'FIELD' @ [112:72] ==> enum entry FIELD defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'getCallableSignature' @ [116:25] ==> private final fun getCallableSignature(proto: MessageLite, nameResolver: NameResolver, typeTable: TypeTable, kind: AnnotatedCallableKind): MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'proto' @ [116:46] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'container' @ [116:53] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [116:63] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'container' @ [116:77] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'typeTable' @ [116:87] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'kind' @ [116:98] ==> value-parameter kind: AnnotatedCallableKind defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'emptyList' @ [116:114] ==> public fun <T> emptyList(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'transformAnnotations' @ [117:16] ==> protected abstract fun transformAnnotations(annotations: List<A>): List<T> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'findClassAndLoadMemberAnnotations' @ [117:37] ==> private final fun findClassAndLoadMemberAnnotations(container: ProtoContainer, signature: MemberSignature, property: Boolean = ..., field: Boolean = ..., isConst: Boolean? = ...): List<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [117:71] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[ValueParameterDescriptorImpl]

'signature' @ [117:82] ==> val signature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadCallableAnnotations[LocalVariableDescriptor]

'MemberSignature' @ [121:25] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromFieldNameAndDesc' @ [121:41] ==> @JvmStatic public final fun fromFieldNameAndDesc(name: String, desc: String): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'container' @ [122:17] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadEnumEntryAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [122:27] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'getString' @ [122:40] ==> @NotNull public abstract fun getString(p0: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [122:50] ==> value-parameter proto: ProtoBuf.EnumEntry defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadEnumEntryAnnotations[ValueParameterDescriptorImpl]

'name' @ [122:56] ==> public final val ProtoBuf.EnumEntry.name: Int[MyPropertyDescriptor]

'ClassMapperLite' @ [123:17] ==> public object ClassMapperLite defined in org.jetbrains.kotlin.serialization.jvm in file ClassMapperLite.kt[FakeCallableDescriptorForObject]

'mapClass' @ [123:33] ==> @JvmStatic public final fun mapClass(classId: ClassId): String defined in org.jetbrains.kotlin.serialization.jvm.ClassMapperLite[SimpleFunctionDescriptorImpl]

'container' @ [123:43] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadEnumEntryAnnotations[ValueParameterDescriptorImpl]

'classId' @ [123:78] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'findClassAndLoadMemberAnnotations' @ [125:16] ==> private final fun findClassAndLoadMemberAnnotations(container: ProtoContainer, signature: MemberSignature, property: Boolean = ..., field: Boolean = ..., isConst: Boolean? = ...): List<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [125:50] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadEnumEntryAnnotations[ValueParameterDescriptorImpl]

'signature' @ [125:61] ==> val signature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadEnumEntryAnnotations[LocalVariableDescriptor]

'findClassWithAnnotationsAndInitializers' @ [138:17] ==> private final fun findClassWithAnnotationsAndInitializers(container: ProtoContainer, specialCase: KotlinJvmBinaryClass?): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [138:57] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.findClassAndLoadMemberAnnotations[ValueParameterDescriptorImpl]

'getSpecialCaseContainerClass' @ [138:68] ==> private final fun getSpecialCaseContainerClass(container: ProtoContainer, property: Boolean, field: Boolean, isConst: Boolean?): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [138:97] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.findClassAndLoadMemberAnnotations[ValueParameterDescriptorImpl]

'property' @ [138:108] ==> value-parameter property: Boolean = ... defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.findClassAndLoadMemberAnnotations[ValueParameterDescriptorImpl]

'field' @ [138:118] ==> value-parameter field: Boolean = ... defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.findClassAndLoadMemberAnnotations[ValueParameterDescriptorImpl]

'isConst' @ [138:125] ==> value-parameter isConst: Boolean? = ... defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.findClassAndLoadMemberAnnotations[ValueParameterDescriptorImpl]

'listOf' @ [139:27] ==> @InlineOnly public inline fun <T> listOf(): List<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'invoke' @ [141:16] ==> public abstract fun invoke(p1: KotlinJvmBinaryClass): AbstractBinaryClassAnnotationAndConstantLoader.Storage<A, C> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'kotlinClass' @ [141:24] ==> val kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.findClassAndLoadMemberAnnotations[LocalVariableDescriptor]

'memberAnnotations' @ [141:37] ==> public final val memberAnnotations: Map<MemberSignature, List<A>> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Storage[PropertyDescriptorImpl]

'signature' @ [141:55] ==> value-parameter signature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.findClassAndLoadMemberAnnotations[ValueParameterDescriptorImpl]

'listOf' @ [141:69] ==> @InlineOnly public inline fun <T> listOf(): List<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'getCallableSignature' @ [151:31] ==> private final fun getCallableSignature(proto: MessageLite, nameResolver: NameResolver, typeTable: TypeTable, kind: AnnotatedCallableKind): MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'callableProto' @ [151:52] ==> value-parameter callableProto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'container' @ [151:67] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [151:77] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'container' @ [151:91] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'typeTable' @ [151:101] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'kind' @ [151:112] ==> value-parameter kind: AnnotatedCallableKind defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'methodSignature' @ [152:13] ==> val methodSignature: MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[LocalVariableDescriptor]

'parameterIndex' @ [153:25] ==> value-parameter parameterIndex: Int defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'computeJvmParameterIndexShift' @ [153:42] ==> private final fun computeJvmParameterIndexShift(container: ProtoContainer, message: MessageLite): Int defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [153:72] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'callableProto' @ [153:83] ==> value-parameter callableProto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'MemberSignature' @ [154:34] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromMethodSignatureAndParameterIndex' @ [154:50] ==> @JvmStatic public final fun fromMethodSignatureAndParameterIndex(signature: MemberSignature, index: Int): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'methodSignature' @ [154:87] ==> val methodSignature: MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[LocalVariableDescriptor]

'index' @ [154:104] ==> val index: Int defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[LocalVariableDescriptor]

'findClassAndLoadMemberAnnotations' @ [155:20] ==> private final fun findClassAndLoadMemberAnnotations(container: ProtoContainer, signature: MemberSignature, property: Boolean = ..., field: Boolean = ..., isConst: Boolean? = ...): List<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [155:54] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'paramSignature' @ [155:65] ==> val paramSignature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadValueParameterAnnotations[LocalVariableDescriptor]

'listOf' @ [158:16] ==> @InlineOnly public inline fun <T> listOf(): List<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'when (message) {
            is ProtoBuf.Function -> if (message.hasReceiver()) 1 else 0
            is ProtoBuf.Property -> if (message.hasReceiver()) 1 else 0
            is ProtoBuf.Constructor -> when {
                (container as ProtoContainer.Class).kind == ProtoBuf.Class.Kind.ENUM_CLASS -> 2
                container.isInner -> 1
                else -> 0
            }
            else -> throw UnsupportedOperationException("Unsupported message: ${message::class.java}")
        }' @ [162:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'message' @ [162:22] ==> value-parameter message: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.computeJvmParameterIndexShift[ValueParameterDescriptorImpl]

'if (message.hasReceiver()) 1 else 0' @ [163:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'message' @ [163:41] ==> value-parameter message: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.computeJvmParameterIndexShift[ValueParameterDescriptorImpl]

'hasReceiver' @ [163:49] ==> public fun ProtoBuf.Function.hasReceiver(): Boolean defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'if (message.hasReceiver()) 1 else 0' @ [164:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'message' @ [164:41] ==> value-parameter message: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.computeJvmParameterIndexShift[ValueParameterDescriptorImpl]

'hasReceiver' @ [164:49] ==> public fun ProtoBuf.Property.hasReceiver(): Boolean defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'when {
                (container as ProtoContainer.Class).kind == ProtoBuf.Class.Kind.ENUM_CLASS -> 2
                container.isInner -> 1
                else -> 0
            }' @ [165:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'==' @ [166:17] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[DeserializedSimpleFunctionDescriptor]

'container' @ [166:18] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.computeJvmParameterIndexShift[ValueParameterDescriptorImpl]

'kind' @ [166:53] ==> public final val kind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'ENUM_CLASS' @ [166:81] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'container' @ [167:17] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.computeJvmParameterIndexShift[ValueParameterDescriptorImpl]

'isInner' @ [167:27] ==> public final val isInner: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'UnsupportedOperationException' @ [170:27] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'message' @ [170:81] ==> value-parameter message: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.computeJvmParameterIndexShift[ValueParameterDescriptorImpl]

'java' @ [170:96] ==> public val <T> KClass<out MessageLite>.java: Class<out MessageLite> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MessageLite

'getCallableSignature' @ [179:31] ==> private final fun getCallableSignature(proto: MessageLite, nameResolver: NameResolver, typeTable: TypeTable, kind: AnnotatedCallableKind): MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'proto' @ [179:52] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadExtensionReceiverParameterAnnotations[ValueParameterDescriptorImpl]

'container' @ [179:59] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadExtensionReceiverParameterAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [179:69] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'container' @ [179:83] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadExtensionReceiverParameterAnnotations[ValueParameterDescriptorImpl]

'typeTable' @ [179:93] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'kind' @ [179:104] ==> value-parameter kind: AnnotatedCallableKind defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadExtensionReceiverParameterAnnotations[ValueParameterDescriptorImpl]

'methodSignature' @ [180:13] ==> val methodSignature: MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadExtensionReceiverParameterAnnotations[LocalVariableDescriptor]

'MemberSignature' @ [181:34] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromMethodSignatureAndParameterIndex' @ [181:50] ==> @JvmStatic public final fun fromMethodSignatureAndParameterIndex(signature: MemberSignature, index: Int): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'methodSignature' @ [181:87] ==> val methodSignature: MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadExtensionReceiverParameterAnnotations[LocalVariableDescriptor]

'findClassAndLoadMemberAnnotations' @ [182:20] ==> private final fun findClassAndLoadMemberAnnotations(container: ProtoContainer, signature: MemberSignature, property: Boolean = ..., field: Boolean = ..., isConst: Boolean? = ...): List<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [182:54] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadExtensionReceiverParameterAnnotations[ValueParameterDescriptorImpl]

'paramSignature' @ [182:65] ==> val paramSignature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadExtensionReceiverParameterAnnotations[LocalVariableDescriptor]

'emptyList' @ [185:16] ==> public fun <T> emptyList(): List<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'proto' @ [189:16] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadTypeAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [189:22] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Type..ProtoBuf.Type?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Type..ProtoBuf.Type?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?)): (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.serialization.ProtoBuf.Annotation..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation?)>..kotlin.collections.List<(org.jetbrains.kotlin.serialization.ProtoBuf.Annotation..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation?)>)

'typeAnnotation' @ [189:47] ==> public final val typeAnnotation: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Type..ProtoBuf.Type?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Type..ProtoBuf.Type?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'map' @ [189:63] ==> public inline fun <T, R> Iterable<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>.map(transform: ((ProtoBuf.Annotation..ProtoBuf.Annotation?)) -> A): List<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Annotation..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation?)
    <R> -> A

'loadTypeAnnotation' @ [189:69] ==> protected abstract fun loadTypeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): A defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'it' @ [189:88] ==> value-parameter it: (ProtoBuf.Annotation..ProtoBuf.Annotation?) defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadTypeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'nameResolver' @ [189:92] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadTypeAnnotations[ValueParameterDescriptorImpl]

'proto' @ [193:16] ==> value-parameter proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadTypeParameterAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [193:22] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?)): (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.serialization.ProtoBuf.Annotation..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation?)>..kotlin.collections.List<(org.jetbrains.kotlin.serialization.ProtoBuf.Annotation..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation?)>)

'typeParameterAnnotation' @ [193:47] ==> public final val typeParameterAnnotation: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'map' @ [193:72] ==> public inline fun <T, R> Iterable<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>.map(transform: ((ProtoBuf.Annotation..ProtoBuf.Annotation?)) -> A): List<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Annotation..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation?)
    <R> -> A

'loadTypeAnnotation' @ [193:78] ==> protected abstract fun loadTypeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): A defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'it' @ [193:97] ==> value-parameter it: (ProtoBuf.Annotation..ProtoBuf.Annotation?) defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadTypeParameterAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'nameResolver' @ [193:101] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadTypeParameterAnnotations[ValueParameterDescriptorImpl]

'getCallableSignature' @ [197:25] ==> private final fun getCallableSignature(proto: MessageLite, nameResolver: NameResolver, typeTable: TypeTable, kind: AnnotatedCallableKind): MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'proto' @ [197:46] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadPropertyConstant[ValueParameterDescriptorImpl]

'container' @ [197:53] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadPropertyConstant[ValueParameterDescriptorImpl]

'nameResolver' @ [197:63] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'container' @ [197:77] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadPropertyConstant[ValueParameterDescriptorImpl]

'typeTable' @ [197:87] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'PROPERTY' @ [197:120] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'getSpecialCaseContainerClass' @ [200:27] ==> private final fun getSpecialCaseContainerClass(container: ProtoContainer, property: Boolean, field: Boolean, isConst: Boolean?): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [200:56] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadPropertyConstant[ValueParameterDescriptorImpl]

'IS_CONST' @ [200:114] ==> public final val IS_CONST: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [200:123] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'proto' @ [200:127] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadPropertyConstant[ValueParameterDescriptorImpl]

'flags' @ [200:133] ==> public final val ProtoBuf.Property.flags: Int[MyPropertyDescriptor]

'findClassWithAnnotationsAndInitializers' @ [201:27] ==> private final fun findClassWithAnnotationsAndInitializers(container: ProtoContainer, specialCase: KotlinJvmBinaryClass?): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [201:67] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadPropertyConstant[ValueParameterDescriptorImpl]

'specialCase' @ [201:78] ==> val specialCase: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadPropertyConstant[LocalVariableDescriptor]

'invoke' @ [203:16] ==> public abstract fun invoke(p1: KotlinJvmBinaryClass): AbstractBinaryClassAnnotationAndConstantLoader.Storage<A, C> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'kotlinClass' @ [203:24] ==> val kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadPropertyConstant[LocalVariableDescriptor]

'propertyConstants' @ [203:37] ==> public final val propertyConstants: Map<MemberSignature, C> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Storage[PropertyDescriptorImpl]

'signature' @ [203:55] ==> val signature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadPropertyConstant[LocalVariableDescriptor]

'when {
            specialCase != null -> specialCase
            container is ProtoContainer.Class -> container.toBinaryClass()
            else -> null
        }' @ [209:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinJvmBinaryClass?, entry1: KotlinJvmBinaryClass?, entry2: KotlinJvmBinaryClass?): KotlinJvmBinaryClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinJvmBinaryClass?

'specialCase' @ [210:13] ==> value-parameter specialCase: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.findClassWithAnnotationsAndInitializers[ValueParameterDescriptorImpl]

'specialCase' @ [210:36] ==> value-parameter specialCase: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.findClassWithAnnotationsAndInitializers[ValueParameterDescriptorImpl]

'container' @ [211:13] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.findClassWithAnnotationsAndInitializers[ValueParameterDescriptorImpl]

'container' @ [211:50] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.findClassWithAnnotationsAndInitializers[ValueParameterDescriptorImpl]

'toBinaryClass' @ [211:60] ==> private final fun ProtoContainer.Class.toBinaryClass(): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'property' @ [221:13] ==> value-parameter property: Boolean defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'checkNotNull' @ [222:13] ==> @InlineOnly public inline fun <T : Any> checkNotNull(value: Boolean?, lazyMessage: () -> Any): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Boolean

'isConst' @ [222:26] ==> value-parameter isConst: Boolean? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'container' @ [222:90] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'container' @ [223:17] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'container' @ [223:54] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'kind' @ [223:64] ==> public final val kind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'INTERFACE' @ [223:92] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'kotlinClassFinder' @ [224:24] ==> private final val kotlinClassFinder: KotlinClassFinder defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[PropertyDescriptorImpl]

'findKotlinClass' @ [224:42] ==> public abstract fun findKotlinClass(classId: ClassId): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinClassFinder[SimpleFunctionDescriptorImpl]

'container' @ [225:25] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'classId' @ [225:35] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'createNestedClassId' @ [225:43] ==> @NotNull public open fun createNestedClassId(@NotNull p0: Name): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'identifier' @ [225:68] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'DEFAULT_IMPLS_CLASS_NAME' @ [225:86] ==> public const final val DEFAULT_IMPLS_CLASS_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'isConst' @ [228:17] ==> value-parameter isConst: Boolean? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'container' @ [228:30] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'container' @ [230:40] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'source' @ [230:50] ==> public final val source: SourceElement? defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'facadeClassName' @ [230:84] ==> public final val facadeClassName: JvmClassName? defined in org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource[PropertyDescriptorImpl]

'facadeClassName' @ [231:21] ==> val facadeClassName: JvmClassName? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[LocalVariableDescriptor]

'kotlinClassFinder' @ [233:28] ==> private final val kotlinClassFinder: KotlinClassFinder defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[PropertyDescriptorImpl]

'findKotlinClass' @ [233:46] ==> public abstract fun findKotlinClass(classId: ClassId): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinClassFinder[SimpleFunctionDescriptorImpl]

'topLevel' @ [233:70] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FqName' @ [233:79] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'facadeClassName' @ [233:86] ==> val facadeClassName: JvmClassName? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[LocalVariableDescriptor]

'internalName' @ [233:102] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'replace' @ [233:115] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'field' @ [237:13] ==> value-parameter field: Boolean defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'container' @ [237:22] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'container' @ [237:59] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'kind' @ [237:69] ==> public final val kind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'COMPANION_OBJECT' @ [237:97] ==> enum entry COMPANION_OBJECT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'container' @ [238:30] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'outerClass' @ [238:40] ==> public final val outerClass: ProtoContainer.Class? defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'outerClass' @ [239:17] ==> val outerClass: ProtoContainer.Class? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[LocalVariableDescriptor]

'outerClass' @ [239:40] ==> val outerClass: ProtoContainer.Class? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[LocalVariableDescriptor]

'kind' @ [239:51] ==> public final val kind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'CLASS' @ [239:79] ==> enum entry CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'outerClass' @ [239:88] ==> val outerClass: ProtoContainer.Class? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[LocalVariableDescriptor]

'kind' @ [239:99] ==> public final val kind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'ENUM_CLASS' @ [239:127] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'outerClass' @ [241:24] ==> val outerClass: ProtoContainer.Class? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[LocalVariableDescriptor]

'toBinaryClass' @ [241:35] ==> private final fun ProtoContainer.Class.toBinaryClass(): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'container' @ [244:13] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'container' @ [244:52] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'source' @ [244:62] ==> public final val source: SourceElement? defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'container' @ [245:40] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[ValueParameterDescriptorImpl]

'source' @ [245:50] ==> public final val source: SourceElement? defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'jvmPackagePartSource' @ [247:20] ==> val jvmPackagePartSource: JvmPackagePartSource defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[LocalVariableDescriptor]

'knownJvmBinaryClass' @ [247:41] ==> public final val knownJvmBinaryClass: KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource[PropertyDescriptorImpl]

'kotlinClassFinder' @ [248:23] ==> private final val kotlinClassFinder: KotlinClassFinder defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[PropertyDescriptorImpl]

'findKotlinClass' @ [248:41] ==> public abstract fun findKotlinClass(classId: ClassId): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinClassFinder[SimpleFunctionDescriptorImpl]

'jvmPackagePartSource' @ [248:57] ==> val jvmPackagePartSource: JvmPackagePartSource defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getSpecialCaseContainerClass[LocalVariableDescriptor]

'classId' @ [248:78] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource[PropertyDescriptorImpl]

'HashMap' @ [254:33] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> MemberSignature
    <V : (Any..Any?)> -> MutableList<A>

'HashMap' @ [255:33] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> MemberSignature
    <V : (Any..Any?)> -> C

'kotlinClass' @ [257:9] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers[ValueParameterDescriptorImpl]

'visitMembers' @ [257:21] ==> public abstract fun visitMembers(visitor: KotlinJvmBinaryClass.MemberVisitor, cachedContents: ByteArray?): Unit defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[SimpleFunctionDescriptorImpl]

'AnnotationVisitorForMethod' @ [259:24] ==> public constructor AnnotationVisitorForMethod(signature: MemberSignature) defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod[ClassConstructorDescriptorImpl]

'MemberSignature' @ [259:51] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromMethodNameAndDesc' @ [259:67] ==> @JvmStatic public final fun fromMethodNameAndDesc(name: String, desc: String): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'name' @ [259:89] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'asString' @ [259:94] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'desc' @ [259:106] ==> value-parameter desc: String defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'MemberSignature' @ [263:33] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromFieldNameAndDesc' @ [263:49] ==> @JvmStatic public final fun fromFieldNameAndDesc(name: String, desc: String): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'name' @ [263:70] ==> value-parameter name: Name defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.visitField[ValueParameterDescriptorImpl]

'asString' @ [263:75] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'desc' @ [263:87] ==> value-parameter desc: String defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.visitField[ValueParameterDescriptorImpl]

'initializer' @ [265:21] ==> value-parameter initializer: Any? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.visitField[ValueParameterDescriptorImpl]

'loadConstant' @ [266:36] ==> protected abstract fun loadConstant(desc: String, initializer: Any): C? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'desc' @ [266:49] ==> value-parameter desc: String defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.visitField[ValueParameterDescriptorImpl]

'initializer' @ [266:55] ==> value-parameter initializer: Any? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.visitField[ValueParameterDescriptorImpl]

'constant' @ [267:25] ==> val constant: C? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.visitField[LocalVariableDescriptor]

'propertyConstants' @ [268:25] ==> val propertyConstants: HashMap<MemberSignature, C> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers[LocalVariableDescriptor]

'signature' @ [268:43] ==> val signature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.visitField[LocalVariableDescriptor]

'constant' @ [268:56] ==> val constant: C? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.visitField[LocalVariableDescriptor]

'MemberAnnotationVisitor' @ [271:24] ==> public constructor MemberAnnotationVisitor(signature: MemberSignature) defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.MemberAnnotationVisitor[ClassConstructorDescriptorImpl]

'signature' @ [271:48] ==> val signature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.visitField[LocalVariableDescriptor]

'MemberAnnotationVisitor' @ [274:82] ==> public constructor MemberAnnotationVisitor(signature: MemberSignature) defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.MemberAnnotationVisitor[ClassConstructorDescriptorImpl]

'signature' @ [274:106] ==> value-parameter signature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod.<init>[ValueParameterDescriptorImpl]

'MemberSignature' @ [279:42] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromMethodSignatureAndParameterIndex' @ [279:58] ==> @JvmStatic public final fun fromMethodSignatureAndParameterIndex(signature: MemberSignature, index: Int): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'signature' @ [279:95] ==> protected final val signature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod[PropertyDescriptorImpl]

'index' @ [279:106] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod.visitParameterAnnotation[ValueParameterDescriptorImpl]

'memberAnnotations' @ [280:34] ==> val memberAnnotations: HashMap<MemberSignature, MutableList<A>> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers[LocalVariableDescriptor]

'paramSignature' @ [280:52] ==> val paramSignature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod.visitParameterAnnotation[LocalVariableDescriptor]

'result' @ [281:25] ==> var result: MutableList<A>? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod.visitParameterAnnotation[LocalVariableDescriptor]

'result' @ [282:25] ==> var result: MutableList<A>? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod.visitParameterAnnotation[LocalVariableDescriptor]

'ArrayList' @ [282:34] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A

'memberAnnotations' @ [283:25] ==> val memberAnnotations: HashMap<MemberSignature, MutableList<A>> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers[LocalVariableDescriptor]

'paramSignature' @ [283:43] ==> val paramSignature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod.visitParameterAnnotation[LocalVariableDescriptor]

'result' @ [283:61] ==> var result: MutableList<A>? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod.visitParameterAnnotation[LocalVariableDescriptor]

'loadAnnotationIfNotSpecial' @ [285:28] ==> private final fun loadAnnotationIfNotSpecial(annotationClassId: ClassId, source: SourceElement, result: MutableList<A>): KotlinJvmBinaryClass.AnnotationArgumentVisitor? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'classId' @ [285:55] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod.visitParameterAnnotation[ValueParameterDescriptorImpl]

'source' @ [285:64] ==> value-parameter source: SourceElement defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod.visitParameterAnnotation[ValueParameterDescriptorImpl]

'result' @ [285:72] ==> var result: MutableList<A>? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.AnnotationVisitorForMethod.visitParameterAnnotation[LocalVariableDescriptor]

'ArrayList' @ [290:38] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A

'loadAnnotationIfNotSpecial' @ [293:28] ==> private final fun loadAnnotationIfNotSpecial(annotationClassId: ClassId, source: SourceElement, result: MutableList<A>): KotlinJvmBinaryClass.AnnotationArgumentVisitor? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'classId' @ [293:55] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.MemberAnnotationVisitor.visitAnnotation[ValueParameterDescriptorImpl]

'source' @ [293:64] ==> value-parameter source: SourceElement defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.MemberAnnotationVisitor.visitAnnotation[ValueParameterDescriptorImpl]

'result' @ [293:72] ==> private final val result: ArrayList<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.MemberAnnotationVisitor[PropertyDescriptorImpl]

'result' @ [297:25] ==> private final val result: ArrayList<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.MemberAnnotationVisitor[PropertyDescriptorImpl]

'isNotEmpty' @ [297:32] ==> @InlineOnly public inline fun <T> Collection<A>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'memberAnnotations' @ [298:25] ==> val memberAnnotations: HashMap<MemberSignature, MutableList<A>> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers[LocalVariableDescriptor]

'signature' @ [298:43] ==> protected final val signature: MemberSignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.MemberAnnotationVisitor[PropertyDescriptorImpl]

'result' @ [298:56] ==> private final val result: ArrayList<A> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers.<no name provided>.MemberAnnotationVisitor[PropertyDescriptorImpl]

'getCachedFileContent' @ [302:12] ==> protected open fun getCachedFileContent(kotlinClass: KotlinJvmBinaryClass): ByteArray? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [302:33] ==> value-parameter kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers[ValueParameterDescriptorImpl]

'Storage' @ [304:16] ==> public constructor Storage<out A, out C>(memberAnnotations: Map<MemberSignature, List<A>>, propertyConstants: Map<MemberSignature, C>) defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.Storage[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> A
    <out C> -> C

'memberAnnotations' @ [304:24] ==> val memberAnnotations: HashMap<MemberSignature, MutableList<A>> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers[LocalVariableDescriptor]

'propertyConstants' @ [304:43] ==> val propertyConstants: HashMap<MemberSignature, C> defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.loadAnnotationsAndInitializers[LocalVariableDescriptor]

'if (proto.hasExtension(propertySignature)) proto.getExtension(propertySignature)
                else return null' @ [315:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JvmProtoBuf.JvmPropertySignature, elseBranch: JvmProtoBuf.JvmPropertySignature): JvmProtoBuf.JvmPropertySignature[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JvmPropertySignature

'proto' @ [315:21] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[ValueParameterDescriptorImpl]

'hasExtension' @ [315:27] ==> public final fun <Type : (Any..Any?)> hasExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?)): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> JvmPropertySignature

'propertySignature' @ [315:40] ==> public final val propertySignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'proto' @ [315:60] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[ValueParameterDescriptorImpl]

'getExtension' @ [315:66] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?)): (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> JvmPropertySignature

'propertySignature' @ [315:79] ==> public final val propertySignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'if (field) {
            val (name, desc) = JvmProtoBufUtil.getJvmFieldSignature(proto, nameResolver, typeTable) ?: return null
            return MemberSignature.fromFieldNameAndDesc(name, desc)
        }
        else if (synthetic && signature.hasSyntheticMethod()) {
            return MemberSignature.fromMethod(nameResolver, signature.syntheticMethod)
        }' @ [318:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'field' @ [318:13] ==> value-parameter field: Boolean = ... defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[ValueParameterDescriptorImpl]

'component1' @ [319:18] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.PropertySignature[SimpleFunctionDescriptorImpl]

'component2' @ [319:24] ==> public final operator fun component2(): String defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil.PropertySignature[SimpleFunctionDescriptorImpl]

'JvmProtoBufUtil' @ [319:32] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm in file JvmProtoBufUtil.kt[FakeCallableDescriptorForObject]

'getJvmFieldSignature' @ [319:48] ==> public final fun getJvmFieldSignature(proto: ProtoBuf.Property, nameResolver: NameResolver, typeTable: TypeTable): JvmProtoBufUtil.PropertySignature? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'proto' @ [319:69] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[ValueParameterDescriptorImpl]

'nameResolver' @ [319:76] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[ValueParameterDescriptorImpl]

'typeTable' @ [319:90] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[ValueParameterDescriptorImpl]

'MemberSignature' @ [320:20] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromFieldNameAndDesc' @ [320:36] ==> @JvmStatic public final fun fromFieldNameAndDesc(name: String, desc: String): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'name' @ [320:57] ==> val name: String defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[LocalVariableDescriptor]

'desc' @ [320:63] ==> val desc: String defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[LocalVariableDescriptor]

'synthetic' @ [322:18] ==> value-parameter synthetic: Boolean = ... defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[ValueParameterDescriptorImpl]

'signature' @ [322:31] ==> val signature: JvmProtoBuf.JvmPropertySignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[LocalVariableDescriptor]

'hasSyntheticMethod' @ [322:41] ==> public open fun hasSyntheticMethod(): Boolean defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf.JvmPropertySignature[JavaMethodDescriptor]

'MemberSignature' @ [323:20] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromMethod' @ [323:36] ==> @JvmStatic public final fun fromMethod(nameResolver: NameResolver, signature: JvmProtoBuf.JvmMethodSignature): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'nameResolver' @ [323:47] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[ValueParameterDescriptorImpl]

'signature' @ [323:61] ==> val signature: JvmProtoBuf.JvmPropertySignature defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getPropertySignature[LocalVariableDescriptor]

'syntheticMethod' @ [323:71] ==> public final val JvmProtoBuf.JvmPropertySignature.syntheticMethod: (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)[MyPropertyDescriptor]

'when {
            proto is ProtoBuf.Constructor -> {
                MemberSignature.fromMethodNameAndDesc(JvmProtoBufUtil.getJvmConstructorSignature(proto, nameResolver, typeTable) ?: return null)
            }
            proto is ProtoBuf.Function -> {
                MemberSignature.fromMethodNameAndDesc(JvmProtoBufUtil.getJvmMethodSignature(proto, nameResolver, typeTable) ?: return null)
            }
            proto is ProtoBuf.Property && proto.hasExtension(propertySignature) -> {
                val signature = proto.getExtension(propertySignature)
                when (kind) {
                    AnnotatedCallableKind.PROPERTY_GETTER -> MemberSignature.fromMethod(nameResolver, signature.getter)
                    AnnotatedCallableKind.PROPERTY_SETTER -> MemberSignature.fromMethod(nameResolver, signature.setter)
                    AnnotatedCallableKind.PROPERTY -> getPropertySignature(proto, nameResolver, typeTable, true, true)
                    else -> null
                }
            }
            else -> null
        }' @ [335:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MemberSignature?, entry1: MemberSignature?, entry2: MemberSignature?, entry3: MemberSignature?): MemberSignature?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MemberSignature?

'proto' @ [336:13] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'MemberSignature' @ [337:17] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromMethodNameAndDesc' @ [337:33] ==> @JvmStatic public final fun fromMethodNameAndDesc(namePlusDesc: String): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'JvmProtoBufUtil' @ [337:55] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm in file JvmProtoBufUtil.kt[FakeCallableDescriptorForObject]

'getJvmConstructorSignature' @ [337:71] ==> public final fun getJvmConstructorSignature(proto: ProtoBuf.Constructor, nameResolver: NameResolver, typeTable: TypeTable): String? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'proto' @ [337:98] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'nameResolver' @ [337:105] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'typeTable' @ [337:119] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'proto' @ [339:13] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'MemberSignature' @ [340:17] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromMethodNameAndDesc' @ [340:33] ==> @JvmStatic public final fun fromMethodNameAndDesc(namePlusDesc: String): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'JvmProtoBufUtil' @ [340:55] ==> public object JvmProtoBufUtil defined in org.jetbrains.kotlin.serialization.jvm in file JvmProtoBufUtil.kt[FakeCallableDescriptorForObject]

'getJvmMethodSignature' @ [340:71] ==> public final fun getJvmMethodSignature(proto: ProtoBuf.Function, nameResolver: NameResolver, typeTable: TypeTable): String? defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBufUtil[SimpleFunctionDescriptorImpl]

'proto' @ [340:93] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'nameResolver' @ [340:100] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'typeTable' @ [340:114] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'proto' @ [342:13] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'proto' @ [342:43] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'hasExtension' @ [342:49] ==> public final fun <Type : (Any..Any?)> hasExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?)): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> JvmPropertySignature

'propertySignature' @ [342:62] ==> public final val propertySignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'proto' @ [343:33] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'getExtension' @ [343:39] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?)): (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> JvmPropertySignature

'propertySignature' @ [343:52] ==> public final val propertySignature: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?)>?) defined in org.jetbrains.kotlin.serialization.jvm.JvmProtoBuf[JavaPropertyDescriptor]

'when (kind) {
                    AnnotatedCallableKind.PROPERTY_GETTER -> MemberSignature.fromMethod(nameResolver, signature.getter)
                    AnnotatedCallableKind.PROPERTY_SETTER -> MemberSignature.fromMethod(nameResolver, signature.setter)
                    AnnotatedCallableKind.PROPERTY -> getPropertySignature(proto, nameResolver, typeTable, true, true)
                    else -> null
                }' @ [344:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MemberSignature?, entry1: MemberSignature?, entry2: MemberSignature?, entry3: MemberSignature?): MemberSignature?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MemberSignature?

'kind' @ [344:23] ==> value-parameter kind: AnnotatedCallableKind defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'PROPERTY_GETTER' @ [345:43] ==> enum entry PROPERTY_GETTER defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'MemberSignature' @ [345:62] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromMethod' @ [345:78] ==> @JvmStatic public final fun fromMethod(nameResolver: NameResolver, signature: JvmProtoBuf.JvmMethodSignature): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'nameResolver' @ [345:89] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'signature' @ [345:103] ==> val signature: (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?) defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[LocalVariableDescriptor]

'getter' @ [345:113] ==> public final val JvmProtoBuf.JvmPropertySignature.getter: (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)[MyPropertyDescriptor]

'PROPERTY_SETTER' @ [346:43] ==> enum entry PROPERTY_SETTER defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'MemberSignature' @ [346:62] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.MemberSignature[FakeCallableDescriptorForObject]

'fromMethod' @ [346:78] ==> @JvmStatic public final fun fromMethod(nameResolver: NameResolver, signature: JvmProtoBuf.JvmMethodSignature): MemberSignature defined in org.jetbrains.kotlin.load.kotlin.MemberSignature.Companion[SimpleFunctionDescriptorImpl]

'nameResolver' @ [346:89] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'signature' @ [346:103] ==> val signature: (JvmProtoBuf.JvmPropertySignature..JvmProtoBuf.JvmPropertySignature?) defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[LocalVariableDescriptor]

'setter' @ [346:113] ==> public final val JvmProtoBuf.JvmPropertySignature.setter: (JvmProtoBuf.JvmMethodSignature..JvmProtoBuf.JvmMethodSignature?)[MyPropertyDescriptor]

'PROPERTY' @ [347:43] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.serialization.deserialization.AnnotatedCallableKind[FakeCallableDescriptorForObject]

'getPropertySignature' @ [347:55] ==> private final fun getPropertySignature(proto: ProtoBuf.Property, nameResolver: NameResolver, typeTable: TypeTable, field: Boolean = ..., synthetic: Boolean = ...): MemberSignature? defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'proto' @ [347:76] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'nameResolver' @ [347:83] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'typeTable' @ [347:97] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.getCallableSignature[ValueParameterDescriptorImpl]

'listOf' @ [361:35] ==> public fun <T> listOf(vararg elements: (FqName..FqName?)): List<(FqName..FqName?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)

'METADATA_FQ_NAME' @ [362:36] ==> public final val METADATA_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'JETBRAINS_NOT_NULL_ANNOTATION' @ [363:36] ==> public final val JETBRAINS_NOT_NULL_ANNOTATION: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'JETBRAINS_NULLABLE_ANNOTATION' @ [364:36] ==> public final val JETBRAINS_NULLABLE_ANNOTATION: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'FqName' @ [365:17] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'FqName' @ [366:17] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'FqName' @ [367:17] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'map' @ [368:11] ==> public inline fun <T, R> Iterable<(FqName..FqName?)>.map(transform: ((FqName..FqName?)) -> ClassId): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <R> -> ClassId

'toSet' @ [368:34] ==> public fun <T> Iterable<ClassId>.toSet(): Set<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

