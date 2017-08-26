'PackageFragmentDescriptorImpl' @ [38:5] ==> public constructor PackageFragmentDescriptorImpl(module: ModuleDescriptor, fqName: FqName) defined in org.jetbrains.kotlin.descriptors.impl.PackageFragmentDescriptorImpl[ClassConstructorDescriptorImpl]

'outerContext' @ [38:35] ==> value-parameter outerContext: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.<init>[ValueParameterDescriptorImpl]

'module' @ [38:48] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'jPackage' @ [38:56] ==> value-parameter jPackage: JavaPackage defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.<init>[ValueParameterDescriptorImpl]

'fqName' @ [38:65] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.load.java.structure.JavaPackage[PropertyDescriptorImpl]

'outerContext' @ [39:21] ==> value-parameter outerContext: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.<init>[ValueParameterDescriptorImpl]

'childForClassOrPackage' @ [39:34] ==> public fun LazyJavaResolverContext.childForClassOrPackage(containingDeclaration: ClassOrPackageFragmentDescriptor, typeParameterOwner: JavaTypeParameterListOwner? = ..., typeParametersIndexOffset: Int = ...): LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy[SimpleFunctionDescriptorImpl]

'this' @ [39:57] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[LazyClassReceiverParameterDescriptor]

'c' @ [41:35] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'storageManager' @ [41:37] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [41:52] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Map<String, KotlinJvmBinaryClass>): NotNullLazyValue<Map<String, KotlinJvmBinaryClass>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Map<String, KotlinJvmBinaryClass>

'c' @ [42:9] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'components' @ [42:11] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'packageMapper' @ [42:22] ==> public final val packageMapper: PackagePartProvider defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'findPackageParts' @ [42:36] ==> public abstract fun findPackageParts(packageFqName: String): List<String> defined in org.jetbrains.kotlin.descriptors.PackagePartProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [42:53] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'asString' @ [42:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'mapNotNull' @ [42:72] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> Pair<String, KotlinJvmBinaryClass>?): List<Pair<String, KotlinJvmBinaryClass>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> Pair<String, KotlinJvmBinaryClass>

'ClassId' @ [43:27] ==> public constructor ClassId(@NotNull packageFqName: FqName, @NotNull topLevelName: Name) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'fqName' @ [43:35] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'identifier' @ [43:48] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'partName' @ [43:59] ==> value-parameter partName: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.binaryClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [44:13] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'components' @ [44:15] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'kotlinClassFinder' @ [44:26] ==> public final val kotlinClassFinder: KotlinClassFinder defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'findKotlinClass' @ [44:44] ==> public abstract fun findKotlinClass(classId: ClassId): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin.KotlinClassFinder[SimpleFunctionDescriptorImpl]

'classId' @ [44:60] ==> val classId: ClassId defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.binaryClasses.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [44:70] ==> @InlineOnly public inline fun <T, R> KotlinJvmBinaryClass.let(block: (KotlinJvmBinaryClass) -> Pair<String, KotlinJvmBinaryClass>): Pair<String, KotlinJvmBinaryClass> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJvmBinaryClass
    <R> -> Pair<String, KotlinJvmBinaryClass>

'partName' @ [44:76] ==> value-parameter partName: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.binaryClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [44:88] ==> value-parameter it: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.binaryClasses.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [45:11] ==> public fun <K, V> Iterable<Pair<String, KotlinJvmBinaryClass>>.toMap(): Map<String, KotlinJvmBinaryClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> KotlinJvmBinaryClass

'JvmPackageScope' @ [48:25] ==> public constructor JvmPackageScope(c: LazyJavaResolverContext, jPackage: JavaPackage, packageFragment: LazyJavaPackageFragment) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[ClassConstructorDescriptorImpl]

'c' @ [48:41] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'jPackage' @ [48:44] ==> private final val jPackage: JavaPackage defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'this' @ [48:54] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[LazyClassReceiverParameterDescriptor]

'c' @ [50:31] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'storageManager' @ [50:33] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createRecursionTolerantLazyValue' @ [50:48] ==> public abstract fun <T : Any> createRecursionTolerantLazyValue(computable: () -> List<FqName>, onRecursiveCall: List<FqName>): NotNullLazyValue<List<FqName>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> List<FqName>

'jPackage' @ [51:15] ==> private final val jPackage: JavaPackage defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'subPackages' @ [51:24] ==> public abstract val subPackages: Collection<JavaPackage> defined in org.jetbrains.kotlin.load.java.structure.JavaPackage[PropertyDescriptorImpl]

'map' @ [51:36] ==> public inline fun <T, R> Iterable<JavaPackage>.map(transform: (JavaPackage) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaPackage
    <R> -> FqName

'listOf' @ [53:31] ==> @InlineOnly public inline fun <T> listOf(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'if (c.components.annotationTypeQualifierResolver.jsr305State.isIgnored()) Annotations.EMPTY
            else c.resolveAnnotations(jPackage)' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Annotations, elseBranch: Annotations): Annotations[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Annotations

'c' @ [58:17] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'components' @ [58:19] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'annotationTypeQualifierResolver' @ [58:30] ==> public final val annotationTypeQualifierResolver: AnnotationTypeQualifierResolver defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'jsr305State' @ [58:62] ==> public final val jsr305State: Jsr305State defined in org.jetbrains.kotlin.load.java.AnnotationTypeQualifierResolver[PropertyDescriptorImpl]

'isIgnored' @ [58:74] ==> public final fun isIgnored(): Boolean defined in org.jetbrains.kotlin.utils.Jsr305State[SimpleFunctionDescriptorImpl]

'Annotations' @ [58:87] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [58:99] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'c' @ [59:18] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'resolveAnnotations' @ [59:20] ==> public fun LazyJavaResolverContext.resolveAnnotations(annotationsOwner: JavaAnnotationOwner): Annotations defined in org.jetbrains.kotlin.load.java.lazy in file LazyJavaAnnotations.kt[SimpleFunctionDescriptorImpl]

'jPackage' @ [59:39] ==> private final val jPackage: JavaPackage defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'invoke' @ [61:57] ==> public abstract fun invoke(): List<FqName> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'scope' @ [63:83] ==> private final val scope: JvmPackageScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'javaScope' @ [63:89] ==> internal final val javaScope: LazyJavaPackageScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.JvmPackageScope[PropertyDescriptorImpl]

'findClassifierByJavaClass' @ [63:99] ==> internal final fun findClassifierByJavaClass(javaClass: JavaClass): ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageScope[SimpleFunctionDescriptorImpl]

'jClass' @ [63:125] ==> value-parameter jClass: JavaClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.findClassifierByJavaClass[ValueParameterDescriptorImpl]

'c' @ [65:33] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'storageManager' @ [65:35] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'createLazyValue' @ [65:50] ==> public abstract fun <T : Any> createLazyValue(computable: () -> HashMap<String, String> /* = HashMap<String, String> */): NotNullLazyValue<HashMap<String, String> /* = HashMap<String, String> */> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> HashMap<String, String>

'hashMapOf' @ [66:22] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, String> /* = HashMap<String, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'component1' @ [67:29] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, KotlinJvmBinaryClass>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> KotlinJvmBinaryClass

'component2' @ [67:39] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, KotlinJvmBinaryClass>.component2(): KotlinJvmBinaryClass defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> KotlinJvmBinaryClass

'binaryClasses' @ [67:55] ==> internal final val binaryClasses: Map<String, KotlinJvmBinaryClass> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'kotlinClass' @ [68:26] ==> val kotlinClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.partToFacade.<anonymous>[LocalVariableDescriptor]

'classHeader' @ [68:38] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[PropertyDescriptorImpl]

'when (header.kind) {
                KotlinClassHeader.Kind.MULTIFILE_CLASS_PART -> {
                    val facadeName = header.multifileClassName ?: continue@kotlinClasses
                    result[partName] = facadeName.substringAfterLast('/')
                }
                KotlinClassHeader.Kind.FILE_FACADE -> {
                    result[partName] = partName
                }
                else -> {}
            }' @ [69:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'header' @ [69:19] ==> val header: KotlinClassHeader defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.partToFacade.<anonymous>[LocalVariableDescriptor]

'kind' @ [69:26] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'MULTIFILE_CLASS_PART' @ [70:40] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'header' @ [71:38] ==> val header: KotlinClassHeader defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.partToFacade.<anonymous>[LocalVariableDescriptor]

'multifileClassName' @ [71:45] ==> public final val multifileClassName: String? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'result' @ [72:21] ==> val result: HashMap<String, String> /* = HashMap<String, String> */ defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.partToFacade.<anonymous>[LocalVariableDescriptor]

'partName' @ [72:28] ==> val partName: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.partToFacade.<anonymous>[LocalVariableDescriptor]

'facadeName' @ [72:40] ==> val facadeName: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.partToFacade.<anonymous>[LocalVariableDescriptor]

'substringAfterLast' @ [72:51] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'FILE_FACADE' @ [74:40] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'result' @ [75:21] ==> val result: HashMap<String, String> /* = HashMap<String, String> */ defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.partToFacade.<anonymous>[LocalVariableDescriptor]

'partName' @ [75:28] ==> val partName: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.partToFacade.<anonymous>[LocalVariableDescriptor]

'partName' @ [75:40] ==> val partName: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.partToFacade.<anonymous>[LocalVariableDescriptor]

'result' @ [80:9] ==> val result: HashMap<String, String> /* = HashMap<String, String> */ defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.partToFacade.<anonymous>[LocalVariableDescriptor]

'partToFacade' @ [83:75] ==> private final val partToFacade: HashMap<String, String> /* = HashMap<String, String> */ defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'partName' @ [83:88] ==> value-parameter partName: String defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment.getFacadeSimpleNameForPartSimpleName[ValueParameterDescriptorImpl]

'scope' @ [85:37] ==> private final val scope: JvmPackageScope defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'fqName' @ [87:61] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[PropertyDescriptorImpl]

'KotlinJvmBinaryPackageSourceElement' @ [89:47] ==> public constructor KotlinJvmBinaryPackageSourceElement(packageFragment: LazyJavaPackageFragment) defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryPackageSourceElement[ClassConstructorDescriptorImpl]

'this' @ [89:83] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[LazyClassReceiverParameterDescriptor]

