'ClassDescriptorBase' @ [57:5] ==> protected/*protected and package*/ constructor ClassDescriptorBase(@NotNull storageManager: StorageManager, @NotNull containingDeclaration: DeclarationDescriptor, @NotNull name: Name, @NotNull source: SourceElement, isExternal: Boolean) defined in org.jetbrains.kotlin.descriptors.impl.ClassDescriptorBase[JavaClassConstructorDescriptor]

'outerContext' @ [57:25] ==> value-parameter outerContext: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [57:38] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'containingDeclaration' @ [57:54] ==> value-parameter containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.<init>[ValueParameterDescriptorImpl]

'jClass' @ [57:77] ==> value-parameter jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.<init>[ValueParameterDescriptorImpl]

'name' @ [57:84] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'outerContext' @ [58:25] ==> value-parameter outerContext: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.<init>[ValueParameterDescriptorImpl]

'components' @ [58:38] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'sourceElementFactory' @ [58:49] ==> public final val sourceElementFactory: JavaSourceElementFactory defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'source' @ [58:70] ==> public abstract fun source(javaElement: JavaElement): JavaSourceElement defined in org.jetbrains.kotlin.load.java.sources.JavaSourceElementFactory[SimpleFunctionDescriptorImpl]

'jClass' @ [58:77] ==> value-parameter jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.<init>[ValueParameterDescriptorImpl]

'JvmStatic' @ [62:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'setOf' @ [63:53] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'outerContext' @ [66:46] ==> value-parameter outerContext: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.<init>[ValueParameterDescriptorImpl]

'childForClassOrPackage' @ [66:59] ==> public fun LazyJavaResolverContext.childForClassOrPackage(containingDeclaration: ClassOrPackageFragmentDescriptor, typeParameterOwner: JavaTypeParameterListOwner? = ..., typeParametersIndexOffset: Int = ...): LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy in file context.kt[SimpleFunctionDescriptorImpl]

'this' @ [66:82] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[LazyClassReceiverParameterDescriptor]

'jClass' @ [66:88] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'c' @ [69:9] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'components' @ [69:11] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'javaResolverCache' @ [69:22] ==> public final val javaResolverCache: JavaResolverCache defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'recordClass' @ [69:40] ==> public abstract fun recordClass(@NotNull javaClass: JavaClass, @NotNull descriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.load.java.components.JavaResolverCache[JavaMethodDescriptor]

'jClass' @ [69:52] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'this' @ [69:60] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[LazyClassReceiverParameterDescriptor]

'assert' @ [71:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'jClass' @ [71:16] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'lightClassOriginKind' @ [71:23] ==> public abstract val lightClassOriginKind: LightClassOriginKind? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'jClass' @ [72:64] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'when {
        jClass.isAnnotationType -> ClassKind.ANNOTATION_CLASS
        jClass.isInterface -> ClassKind.INTERFACE
        jClass.isEnum -> ClassKind.ENUM_CLASS
        else -> ClassKind.CLASS
    }' @ [76:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassKind, entry1: ClassKind, entry2: ClassKind, entry3: ClassKind): ClassKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassKind

'jClass' @ [77:9] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'isAnnotationType' @ [77:16] ==> public abstract val isAnnotationType: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'ANNOTATION_CLASS' @ [77:46] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'jClass' @ [78:9] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'isInterface' @ [78:16] ==> public abstract val isInterface: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'INTERFACE' @ [78:41] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'jClass' @ [79:9] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'isEnum' @ [79:16] ==> public abstract val isEnum: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'ENUM_CLASS' @ [79:36] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'CLASS' @ [80:27] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'if (jClass.isAnnotationType)
                               Modality.FINAL
                           else Modality.convertFromFlags(jClass.isAbstract || jClass.isInterface, !jClass.isFinal)' @ [83:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Modality, elseBranch: Modality): Modality[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Modality

'jClass' @ [83:32] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'isAnnotationType' @ [83:39] ==> public abstract val isAnnotationType: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'FINAL' @ [84:41] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'convertFromFlags' @ [85:42] ==> public final fun convertFromFlags(abstract: Boolean, open: Boolean): Modality defined in org.jetbrains.kotlin.descriptors.Modality.Companion[SimpleFunctionDescriptorImpl]

'jClass' @ [85:59] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'isAbstract' @ [85:66] ==> public abstract val isAbstract: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'jClass' @ [85:80] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'isInterface' @ [85:87] ==> public abstract val isInterface: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'!' @ [85:100] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'jClass' @ [85:101] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'isFinal' @ [85:108] ==> public abstract val isFinal: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'jClass' @ [87:30] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'visibility' @ [87:37] ==> public abstract val visibility: Visibility defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'jClass' @ [88:27] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'outerClass' @ [88:34] ==> public abstract val outerClass: JavaClass? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'!' @ [88:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'jClass' @ [88:57] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'isStatic' @ [88:64] ==> public abstract val isStatic: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'kind' @ [90:30] ==> private final val kind: ClassKind defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'modality' @ [91:34] ==> private final val modality: Modality defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'if (visibility == Visibilities.PRIVATE && jClass.outerClass == null) JavaVisibilities.PACKAGE_VISIBILITY else visibility' @ [100:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Visibility, elseBranch: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Visibility

'visibility' @ [100:17] ==> private final val visibility: Visibility defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'PRIVATE' @ [100:44] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'jClass' @ [100:55] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'outerClass' @ [100:62] ==> public abstract val outerClass: JavaClass? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'PACKAGE_VISIBILITY' @ [100:99] ==> @NotNull public final val PACKAGE_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'visibility' @ [100:123] ==> private final val visibility: Visibility defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'isInner' @ [102:30] ==> private final val isInner: Boolean defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'LazyJavaClassTypeConstructor' @ [108:35] ==> public constructor LazyJavaClassTypeConstructor() defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor[ClassConstructorDescriptorImpl]

'typeConstructor' @ [109:58] ==> private final val typeConstructor: LazyJavaClassDescriptor.LazyJavaClassTypeConstructor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'LazyJavaClassMemberScope' @ [111:44] ==> public constructor LazyJavaClassMemberScope(c: LazyJavaResolverContext, ownerDescriptor: ClassDescriptor, jClass: JavaClass) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope[ClassConstructorDescriptorImpl]

'c' @ [111:69] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'this' @ [111:72] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[LazyClassReceiverParameterDescriptor]

'jClass' @ [111:78] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'unsubstitutedMemberScope' @ [112:50] ==> private final val unsubstitutedMemberScope: LazyJavaClassMemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'InnerClassesScopeWrapper' @ [114:37] ==> public constructor InnerClassesScopeWrapper(workerScope: MemberScope) defined in org.jetbrains.kotlin.resolve.scopes.InnerClassesScopeWrapper[ClassConstructorDescriptorImpl]

'getUnsubstitutedMemberScope' @ [114:62] ==> public open fun getUnsubstitutedMemberScope(): LazyJavaClassMemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[SimpleFunctionDescriptorImpl]

'innerClassesScope' @ [115:69] ==> private final val innerClassesScope: InnerClassesScopeWrapper defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'LazyJavaStaticClassScope' @ [117:31] ==> public constructor LazyJavaStaticClassScope(c: LazyJavaResolverContext, jClass: JavaClass, ownerDescriptor: LazyJavaClassDescriptor) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaStaticClassScope[ClassConstructorDescriptorImpl]

'c' @ [117:56] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'jClass' @ [117:59] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'this' @ [117:67] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[LazyClassReceiverParameterDescriptor]

'staticScope' @ [118:50] ==> private final val staticScope: LazyJavaStaticClassScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'unsubstitutedMemberScope' @ [124:38] ==> private final val unsubstitutedMemberScope: LazyJavaClassMemberScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'invoke' @ [124:63] ==> public abstract fun invoke(): List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'c' @ [126:32] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'resolveAnnotations' @ [126:34] ==> public fun LazyJavaResolverContext.resolveAnnotations(annotationsOwner: JavaAnnotationOwner): Annotations defined in org.jetbrains.kotlin.load.java.lazy in file LazyJavaAnnotations.kt[SimpleFunctionDescriptorImpl]

'jClass' @ [126:53] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'c' @ [128:38] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'storageManager' @ [128:40] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [128:55] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<TypeParameterDescriptor>): NotNullLazyValue<List<TypeParameterDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> List<TypeParameterDescriptor>

'jClass' @ [129:9] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'typeParameters' @ [129:16] ==> public abstract val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'map' @ [129:31] ==> public inline fun <T, R> Iterable<JavaTypeParameter>.map(transform: (JavaTypeParameter) -> TypeParameterDescriptor): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaTypeParameter
    <R> -> TypeParameterDescriptor

'c' @ [131:13] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'typeParameterResolver' @ [131:15] ==> public final val typeParameterResolver: TypeParameterResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'resolveTypeParameter' @ [131:37] ==> public abstract fun resolveTypeParameter(javaTypeParameter: JavaTypeParameter): TypeParameterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.TypeParameterResolver[SimpleFunctionDescriptorImpl]

'p' @ [131:58] ==> value-parameter p: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.declaredParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [132:26] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'p' @ [132:53] ==> value-parameter p: JavaTypeParameter defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.declaredParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'jClass' @ [132:80] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'invoke' @ [136:48] ==> public abstract fun invoke(): List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'c' @ [138:73] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'components' @ [138:75] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'samConversionResolver' @ [138:86] ==> public final val samConversionResolver: SamConversionResolver defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'resolveFunctionTypeIfSamInterface' @ [138:108] ==> public abstract fun resolveFunctionTypeIfSamInterface(classDescriptor: JavaClassDescriptor): SimpleType? defined in org.jetbrains.kotlin.load.java.components.SamConversionResolver[SimpleFunctionDescriptorImpl]

'this' @ [138:142] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[LazyClassReceiverParameterDescriptor]

'kind' @ [141:13] ==> private final val kind: ClassKind defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'INTERFACE' @ [141:31] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'jClass' @ [143:26] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'methods' @ [143:33] ==> public abstract val methods: Collection<JavaMethod> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'filter' @ [143:41] ==> public inline fun <T> Iterable<JavaMethod>.filter(predicate: (JavaMethod) -> Boolean): List<JavaMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'it' @ [143:50] ==> value-parameter it: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.isDefinitelyNotSamInterface.<anonymous>[ValueParameterDescriptorImpl]

'isAbstract' @ [143:53] ==> public abstract val isAbstract: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'it' @ [143:67] ==> value-parameter it: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.isDefinitelyNotSamInterface.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [143:70] ==> public abstract val typeParameters: List<JavaTypeParameter> defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'isEmpty' @ [143:85] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'candidates' @ [151:13] ==> val candidates: List<JavaMethod> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.isDefinitelyNotSamInterface[LocalVariableDescriptor]

'count' @ [151:24] ==> public inline fun <T> Iterable<JavaMethod>.count(predicate: (JavaMethod) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaMethod

'it' @ [151:32] ==> value-parameter it: JavaMethod defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.isDefinitelyNotSamInterface.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [151:35] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaMethod[PropertyDescriptorImpl]

'identifier' @ [151:40] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'PUBLIC_METHOD_NAMES_IN_OBJECT' @ [151:55] ==> @JvmStatic private final val PUBLIC_METHOD_NAMES_IN_OBJECT: Set<String> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.Companion[PropertyDescriptorImpl]

'typeConstructor' @ [154:16] ==> private final val typeConstructor: LazyJavaClassDescriptor.LazyJavaClassTypeConstructor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'supertypes' @ [154:32] ==> public final val LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.supertypes: List<KotlinType>[MyPropertyDescriptor]

'any' @ [154:43] ==> public inline fun <T> Iterable<KotlinType>.any(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [155:13] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.isDefinitelyNotSamInterface.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [155:16] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [155:28] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'safeAs' @ [155:50] ==> public inline fun <reified T : Any> Any?.safeAs(): LazyJavaClassDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> LazyJavaClassDescriptor

'isDefinitelyNotSamInterface' @ [155:85] ==> public final val LazyJavaClassDescriptor.isDefinitelyNotSamInterface: Boolean[MyPropertyDescriptor]

'emptyList' @ [159:71] ==> public fun <T> emptyList(): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'this' @ [161:50] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[LazyClassReceiverParameterDescriptor]

'fqNameUnsafe' @ [161:55] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'AbstractClassTypeConstructor' @ [163:56] ==> public constructor AbstractClassTypeConstructor(@NotNull storageManager: StorageManager) defined in org.jetbrains.kotlin.types.AbstractClassTypeConstructor[JavaClassConstructorDescriptor]

'c' @ [163:85] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'storageManager' @ [163:87] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'c' @ [164:34] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'storageManager' @ [164:36] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [164:51] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<TypeParameterDescriptor>): NotNullLazyValue<List<TypeParameterDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> List<TypeParameterDescriptor>

'this@LazyJavaClassDescriptor' @ [165:13] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[LazyClassReceiverParameterDescriptor]

'computeConstructorTypeParameters' @ [165:42] ==> public fun ClassifierDescriptorWithTypeParameters.computeConstructorTypeParameters(): List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.descriptors in file typeParameterUtils.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [168:71] ==> public abstract fun invoke(): List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'jClass' @ [171:29] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'supertypes' @ [171:36] ==> public abstract val supertypes: Collection<JavaClassifierType> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'ArrayList' @ [172:26] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'javaTypes' @ [172:48] ==> val javaTypes: Collection<JavaClassifierType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'size' @ [172:58] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'ArrayList' @ [173:30] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JavaType

'getPurelyImplementedSupertype' @ [175:59] ==> private final fun getPurelyImplementedSupertype(): KotlinType? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor[SimpleFunctionDescriptorImpl]

'javaTypes' @ [177:30] ==> val javaTypes: Collection<JavaClassifierType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'c' @ [178:34] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'typeResolver' @ [178:36] ==> public final val typeResolver: JavaTypeResolver defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'transformJavaType' @ [178:49] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [178:67] ==> val javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'toAttributes' @ [178:97] ==> public fun TypeUsage.toAttributes(isForAnnotationParameter: Boolean = ..., upperBoundForTypeParameter: TypeParameterDescriptor? = ...): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types in file JavaTypeResolver.kt[SimpleFunctionDescriptorImpl]

'kotlinType' @ [179:21] ==> val kotlinType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'constructor' @ [179:32] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [179:44] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'incomplete' @ [180:21] ==> val incomplete: ArrayList<JavaType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'add' @ [180:32] ==> public open fun add(element: JavaType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'javaType' @ [180:36] ==> val javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'kotlinType' @ [183:21] ==> val kotlinType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'constructor' @ [183:32] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'purelyImplementedSupertype' @ [183:47] ==> val purelyImplementedSupertype: KotlinType? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'constructor' @ [183:75] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'!' @ [187:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnyOrNullableAny' @ [187:37] ==> public open fun isAnyOrNullableAny(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'kotlinType' @ [187:56] ==> val kotlinType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'result' @ [188:21] ==> val result: ArrayList<KotlinType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'add' @ [188:28] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'kotlinType' @ [188:32] ==> val kotlinType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'result' @ [194:13] ==> val result: ArrayList<KotlinType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'addIfNotNull' @ [194:20] ==> public fun <T : Any> MutableCollection<KotlinType>.addIfNotNull(t: KotlinType?): Unit defined in org.jetbrains.kotlin.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> KotlinType

'additionalSupertypeClassDescriptor' @ [195:21] ==> private final val additionalSupertypeClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'let' @ [195:57] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> KotlinType?

'createMappedTypeParametersSubstitution' @ [196:25] ==> public fun createMappedTypeParametersSubstitution(from: ClassDescriptor, to: ClassDescriptor): TypeConstructorSubstitution defined in org.jetbrains.kotlin.platform in file mappingUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [196:64] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'this@LazyJavaClassDescriptor' @ [196:68] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[LazyClassReceiverParameterDescriptor]

'buildSubstitutor' @ [197:34] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[SimpleFunctionDescriptorImpl]

'substitute' @ [197:53] ==> @Nullable public open fun substitute(@NotNull type: KotlinType, @NotNull howThisTypeIsUsed: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'it' @ [197:64] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [197:67] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'INVARIANT' @ [197:89] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'result' @ [200:13] ==> val result: ArrayList<KotlinType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'addIfNotNull' @ [200:20] ==> public fun <T : Any> MutableCollection<KotlinType>.addIfNotNull(t: KotlinType?): Unit defined in org.jetbrains.kotlin.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> KotlinType

'purelyImplementedSupertype' @ [200:33] ==> val purelyImplementedSupertype: KotlinType? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'incomplete' @ [202:17] ==> val incomplete: ArrayList<JavaType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'isNotEmpty' @ [202:28] ==> @InlineOnly public inline fun <T> Collection<JavaType>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaType

'c' @ [203:17] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'components' @ [203:19] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'errorReporter' @ [203:30] ==> public final val errorReporter: ErrorReporter defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'reportIncompleteHierarchy' @ [203:44] ==> public abstract fun reportIncompleteHierarchy(@NotNull descriptor: ClassDescriptor, @NotNull unresolvedSuperClasses: (MutableList<(String..String?)>..List<(String..String?)>)): Unit defined in org.jetbrains.kotlin.serialization.deserialization.ErrorReporter[JavaMethodDescriptor]

'declarationDescriptor' @ [203:70] ==> public final val LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.declarationDescriptor: LazyJavaClassDescriptor[MyPropertyDescriptor]

'incomplete' @ [203:93] ==> val incomplete: ArrayList<JavaType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'map' @ [203:104] ==> public inline fun <T, R> Iterable<JavaType>.map(transform: (JavaType) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaType
    <R> -> String

'javaType' @ [204:22] ==> value-parameter javaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'presentableText' @ [204:54] ==> public abstract val presentableText: String defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[PropertyDescriptorImpl]

'if (result.isNotEmpty()) result.toList() else listOf(c.module.builtIns.anyType)' @ [208:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<KotlinType>, elseBranch: Collection<KotlinType>): Collection<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<KotlinType>

'result' @ [208:24] ==> val result: ArrayList<KotlinType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'isNotEmpty' @ [208:31] ==> @InlineOnly public inline fun <T> Collection<KotlinType>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'result' @ [208:45] ==> val result: ArrayList<KotlinType> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.computeSupertypes[LocalVariableDescriptor]

'toList' @ [208:52] ==> public fun <T> Iterable<KotlinType>.toList(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'listOf' @ [208:66] ==> public fun <T> listOf(element: SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'c' @ [208:73] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'module' @ [208:75] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [208:82] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'anyType' @ [208:91] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'getPurelyImplementsFqNameFromAnnotation' @ [212:52] ==> private final fun getPurelyImplementsFqNameFromAnnotation(): FqName? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor[SimpleFunctionDescriptorImpl]

'takeIf' @ [212:95] ==> @InlineOnly @SinceKotlin public inline fun <T> FqName.takeIf(predicate: (FqName) -> Boolean): FqName? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'!' @ [213:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fqName' @ [213:18] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype.<anonymous>[ValueParameterDescriptorImpl]

'isRoot' @ [213:25] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'fqName' @ [213:35] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [213:42] ==> public open fun startsWith(@NotNull segment: Name): Boolean defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'BUILT_INS_PACKAGE_NAME' @ [213:68] ==> public final val BUILT_INS_PACKAGE_NAME: (Name..Name?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'annotatedPurelyImplementedFqName' @ [217:21] ==> val annotatedPurelyImplementedFqName: FqName? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'getPurelyImplementedInterface' @ [218:56] ==> public final fun getPurelyImplementedInterface(classFqName: FqName): FqName? defined in org.jetbrains.kotlin.load.java.FakePureImplementationsProvider[SimpleFunctionDescriptorImpl]

'fqNameSafe' @ [218:86] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'c' @ [221:35] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'module' @ [221:37] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'resolveTopLevelClass' @ [221:44] ==> public fun ModuleDescriptor.resolveTopLevelClass(topLevelClassFqName: FqName, location: LookupLocation): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[SimpleFunctionDescriptorImpl]

'purelyImplementedFqName' @ [221:65] ==> val purelyImplementedFqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'FROM_JAVA_LOADER' @ [221:107] ==> enum entry FROM_JAVA_LOADER defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'classDescriptor' @ [223:43] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'typeConstructor' @ [223:59] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [223:75] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [223:86] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'getTypeConstructor' @ [224:34] ==> public open fun getTypeConstructor(): TypeConstructor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[SimpleFunctionDescriptorImpl]

'parameters' @ [224:55] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'typeParameters' @ [225:38] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'size' @ [225:53] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'when {
                typeParameterCount == supertypeParameterCount ->
                    typeParameters.map {
                        parameter ->
                        TypeProjectionImpl(Variance.INVARIANT, parameter.defaultType)
                    }
                typeParameterCount == 1 && supertypeParameterCount > 1 && annotatedPurelyImplementedFqName == null ->
                {
                    val parameter = TypeProjectionImpl(Variance.INVARIANT, typeParameters.single().defaultType)
                    (1..supertypeParameterCount).map { parameter } // TODO: List(supertypeParameterCount) { parameter }
                }
                else -> return null
            }' @ [227:47] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<TypeProjectionImpl>, entry1: List<TypeProjectionImpl>, entry2: List<TypeProjectionImpl>): List<TypeProjectionImpl>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<TypeProjectionImpl>

'typeParameterCount' @ [228:17] ==> val typeParameterCount: Int defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'supertypeParameterCount' @ [228:39] ==> val supertypeParameterCount: Int defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'typeParameters' @ [229:21] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'map' @ [229:36] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> TypeProjectionImpl

'TypeProjectionImpl' @ [231:25] ==> public constructor TypeProjectionImpl(@NotNull projection: Variance, @NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'INVARIANT' @ [231:53] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'parameter' @ [231:64] ==> value-parameter parameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [231:74] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'typeParameterCount' @ [233:17] ==> val typeParameterCount: Int defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'supertypeParameterCount' @ [233:44] ==> val supertypeParameterCount: Int defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'annotatedPurelyImplementedFqName' @ [233:75] ==> val annotatedPurelyImplementedFqName: FqName? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'TypeProjectionImpl' @ [235:37] ==> public constructor TypeProjectionImpl(@NotNull projection: Variance, @NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'INVARIANT' @ [235:65] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'typeParameters' @ [235:76] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'single' @ [235:91] ==> public fun <T> List<(TypeParameterDescriptor..TypeParameterDescriptor?)>.single(): (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'defaultType' @ [235:100] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'..' @ [236:22] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'supertypeParameterCount' @ [236:25] ==> val supertypeParameterCount: Int defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'map' @ [236:50] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> TypeProjectionImpl

'parameter' @ [236:56] ==> val parameter: TypeProjectionImpl defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'KotlinTypeFactory' @ [241:20] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types in file KotlinTypeFactory.kt[FakeCallableDescriptorForObject]

'simpleNotNullType' @ [241:38] ==> @JvmStatic public final fun simpleNotNullType(annotations: Annotations, descriptor: ClassDescriptor, arguments: List<TypeProjection>): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'EMPTY' @ [241:68] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'classDescriptor' @ [241:75] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'parametersAsTypeProjections' @ [241:92] ==> val parametersAsTypeProjections: List<TypeProjectionImpl> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementedSupertype[LocalVariableDescriptor]

'this@LazyJavaClassDescriptor' @ [246:21] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[LazyClassReceiverParameterDescriptor]

'annotations' @ [246:50] ==> public open val annotations: Annotations defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'findAnnotation' @ [246:62] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'PURELY_IMPLEMENTS_ANNOTATION' @ [246:96] ==> public final val PURELY_IMPLEMENTS_ANNOTATION: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'?:' @ [249:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'annotation' @ [249:33] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementsFqNameFromAnnotation[LocalVariableDescriptor]

'allValueArguments' @ [249:44] ==> public abstract val allValueArguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[PropertyDescriptorImpl]

'values' @ [249:62] ==> public abstract val values: Collection<ConstantValue<*>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'singleOrNull' @ [249:69] ==> public fun <T> Iterable<ConstantValue<*>>.singleOrNull(): ConstantValue<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstantValue<*>

'value' @ [249:102] ==> public open val value: String defined in org.jetbrains.kotlin.resolve.constants.StringValue[PropertyDescriptorImpl]

'!' @ [250:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidJavaFqName' @ [250:18] ==> public fun isValidJavaFqName(qualifiedName: String?): Boolean defined in org.jetbrains.kotlin.name in file FqNamesUtil.kt[SimpleFunctionDescriptorImpl]

'fqNameString' @ [250:36] ==> val fqNameString: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementsFqNameFromAnnotation[LocalVariableDescriptor]

'FqName' @ [252:20] ==> public constructor FqName(@NotNull fqName: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'fqNameString' @ [252:27] ==> val fqNameString: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.LazyJavaClassTypeConstructor.getPurelyImplementsFqNameFromAnnotation[LocalVariableDescriptor]

'c' @ [256:21] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'components' @ [256:23] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'supertypeLoopChecker' @ [256:34] ==> public final val supertypeLoopChecker: SupertypeLoopChecker defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'isFinalClass' @ [258:43] ==> public val ClassDescriptor.isFinalClass: Boolean defined in org.jetbrains.kotlin.descriptors in file Modality.kt[PropertyDescriptorImpl]

'this@LazyJavaClassDescriptor' @ [262:51] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[LazyClassReceiverParameterDescriptor]

'name' @ [264:43] ==> public final val LazyJavaClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [264:48] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'LazyJavaClassDescriptor' @ [270:9] ==> public constructor LazyJavaClassDescriptor(outerContext: LazyJavaResolverContext, containingDeclaration: DeclarationDescriptor, jClass: JavaClass, additionalSupertypeClassDescriptor: ClassDescriptor? = ...) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[ClassConstructorDescriptorImpl]

'c' @ [271:13] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'replaceComponents' @ [271:15] ==> public fun LazyJavaResolverContext.replaceComponents(components: JavaResolverComponents): LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy in file context.kt[SimpleFunctionDescriptorImpl]

'c' @ [271:33] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'components' @ [271:35] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'replace' @ [271:46] ==> public final fun replace(javaResolverCache: JavaResolverCache = ...): JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[SimpleFunctionDescriptorImpl]

'javaResolverCache' @ [271:74] ==> value-parameter javaResolverCache: JavaResolverCache defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.copy[ValueParameterDescriptorImpl]

'containingDeclaration' @ [272:13] ==> public final val LazyJavaClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'jClass' @ [272:36] ==> private final val jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor[PropertyDescriptorImpl]

'additionalSupertypeClassDescriptor' @ [272:44] ==> value-parameter additionalSupertypeClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassDescriptor.copy[ValueParameterDescriptorImpl]

