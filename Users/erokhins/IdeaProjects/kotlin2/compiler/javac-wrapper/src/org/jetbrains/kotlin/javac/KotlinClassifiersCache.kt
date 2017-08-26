'sourceFiles' @ [39:65] ==> value-parameter sourceFiles: Collection<KtFile> defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.<init>[ValueParameterDescriptorImpl]

'flatMap' @ [39:77] ==> public inline fun <T, R> Iterable<KtFile>.flatMap(transform: (KtFile) -> Iterable<Pair<FqName?, KtClassOrObject?>>): List<Pair<FqName?, KtClassOrObject?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> Pair<FqName?, KtClassOrObject?>

'ktFile' @ [40:9] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.kotlinClasses.<anonymous>[ValueParameterDescriptorImpl]

'collectDescendantsOfType' @ [40:16] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtClassOrObject) -> Boolean = ...): List<KtClassOrObject> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'map' @ [40:60] ==> public inline fun <T, R> Iterable<KtClassOrObject>.map(transform: (KtClassOrObject) -> Pair<FqName?, KtClassOrObject>): List<Pair<FqName?, KtClassOrObject>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> Pair<FqName?, KtClassOrObject>

'it' @ [40:66] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.kotlinClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [40:69] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'it' @ [40:79] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.kotlinClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ktFile' @ [41:10] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.kotlinClasses.<anonymous>[ValueParameterDescriptorImpl]

'javaFileFacadeFqName' @ [41:17] ==> public val KtFile.javaFileFacadeFqName: FqName defined in org.jetbrains.kotlin.fileClasses[DeserializedPropertyDescriptor]

'toMap' @ [42:7] ==> public fun <K, V> Iterable<Pair<FqName?, KtClassOrObject?>>.toMap(): Map<FqName?, KtClassOrObject?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName?
    <V> -> KtClassOrObject?

'hashMapOf' @ [44:31] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<FqName, JavaClass> /* = HashMap<FqName, JavaClass> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> JavaClass

'classifiers' @ [46:47] ==> private final val classifiers: HashMap<FqName, JavaClass> /* = HashMap<FqName, JavaClass> */ defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache[PropertyDescriptorImpl]

'fqName' @ [46:59] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.getKotlinClassifier[ValueParameterDescriptorImpl]

'createClassifier' @ [46:70] ==> private final fun createClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache[SimpleFunctionDescriptorImpl]

'fqName' @ [46:87] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.getKotlinClassifier[ValueParameterDescriptorImpl]

'!' @ [49:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kotlinClasses' @ [49:14] ==> private final val kotlinClasses: Map<FqName?, KtClassOrObject?> defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache[PropertyDescriptorImpl]

'containsKey' @ [49:28] ==> public abstract fun containsKey(key: FqName?): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'fqName' @ [49:40] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.createClassifier[ValueParameterDescriptorImpl]

'kotlinClasses' @ [50:32] ==> private final val kotlinClasses: Map<FqName?, KtClassOrObject?> defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache[PropertyDescriptorImpl]

'fqName' @ [50:46] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.createClassifier[ValueParameterDescriptorImpl]

'MockKotlinClassifier' @ [52:16] ==> public constructor MockKotlinClassifier(fqName: FqName, classOrObject: KtClassOrObject, hasTypeParameters: Boolean, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.MockKotlinClassifier[ClassConstructorDescriptorImpl]

'fqName' @ [52:37] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.createClassifier[ValueParameterDescriptorImpl]

'kotlinClassifier' @ [53:37] ==> val kotlinClassifier: KtClassOrObject defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.createClassifier[LocalVariableDescriptor]

'kotlinClassifier' @ [54:37] ==> val kotlinClassifier: KtClassOrObject defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.createClassifier[LocalVariableDescriptor]

'typeParameters' @ [54:54] ==> public final val KtClassOrObject.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [54:69] ==> @InlineOnly public inline fun <T> Collection<(KtTypeParameter..KtTypeParameter?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeParameter..org.jetbrains.kotlin.psi.KtTypeParameter?)

'javac' @ [55:37] ==> private final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache[PropertyDescriptorImpl]

'apply' @ [56:18] ==> @InlineOnly public inline fun <T> MockKotlinClassifier.apply(block: MockKotlinClassifier.() -> Unit): MockKotlinClassifier defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockKotlinClassifier

'classifiers' @ [56:26] ==> private final val classifiers: HashMap<FqName, JavaClass> /* = HashMap<FqName, JavaClass> */ defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache[PropertyDescriptorImpl]

'fqName' @ [56:38] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.createClassifier[ValueParameterDescriptorImpl]

'this' @ [56:48] ==> <this> defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache.createClassifier.<anonymous>[ReceiverParameterDescriptorImpl]

'UnsupportedOperationException' @ [67:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [70:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [73:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [76:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [79:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'classOrObject' @ [82:17] ==> private final val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.javac.MockKotlinClassifier[PropertyDescriptorImpl]

'superTypeListEntries' @ [82:31] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'map' @ [83:18] ==> public inline fun <T, R> Iterable<KtSuperTypeListEntry>.map(transform: (KtSuperTypeListEntry) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry
    <R> -> String

'superTypeListEntry' @ [84:36] ==> value-parameter superTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>[ValueParameterDescriptorImpl]

'typeAsUserType' @ [84:55] ==> public final val KtSuperTypeListEntry.typeAsUserType: KtUserType?[MyPropertyDescriptor]

'arrayListOf' @ [85:21] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'apply' @ [85:43] ==> @InlineOnly public inline fun <T> ArrayList<String> /* = ArrayList<String> */.apply(block: ArrayList<String> /* = ArrayList<String> */.() -> Unit): ArrayList<String> /* = ArrayList<String> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<String>

'userType' @ [86:25] ==> val userType: KtUserType? defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>[LocalVariableDescriptor]

'referencedName' @ [86:35] ==> public final val KtUserType.referencedName: String?[MyPropertyDescriptor]

'let' @ [86:51] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'add' @ [86:57] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [86:61] ==> value-parameter it: String defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'userType' @ [87:41] ==> val userType: KtUserType? defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>[LocalVariableDescriptor]

'qualifier' @ [87:51] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'qualifier' @ [88:32] ==> var qualifier: KtUserType? defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'qualifier' @ [89:29] ==> var qualifier: KtUserType? defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'referencedName' @ [89:39] ==> public final val KtUserType.referencedName: String?[MyPropertyDescriptor]

'let' @ [89:55] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'add' @ [89:61] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [89:65] ==> value-parameter it: String defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [90:29] ==> var qualifier: KtUserType? defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'qualifier' @ [90:41] ==> var qualifier: KtUserType? defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'qualifier' @ [90:51] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'reversed' @ [92:23] ==> public fun <T> Iterable<String>.reversed(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'joinToString' @ [92:34] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [92:66] ==> value-parameter it: String defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mapNotNull' @ [94:18] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> JavaClass?): List<JavaClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> JavaClass

'resolveSupertype' @ [94:31] ==> private fun resolveSupertype(name: String, classOrObject: KtClassOrObject, javac: JavacWrapper): JavaClass? defined in org.jetbrains.kotlin.javac in file KotlinClassifiersCache.kt[SimpleFunctionDescriptorImpl]

'it' @ [94:48] ==> value-parameter it: String defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>[ValueParameterDescriptorImpl]

'classOrObject' @ [94:52] ==> private final val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.javac.MockKotlinClassifier[PropertyDescriptorImpl]

'javac' @ [94:67] ==> private final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.MockKotlinClassifier[PropertyDescriptorImpl]

'map' @ [95:18] ==> public inline fun <T, R> Iterable<JavaClass>.map(transform: (JavaClass) -> MockKotlinClassifierType): List<MockKotlinClassifierType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> MockKotlinClassifierType

'MockKotlinClassifierType' @ [95:24] ==> public constructor MockKotlinClassifierType(classifier: JavaClassifier) defined in org.jetbrains.kotlin.javac.MockKotlinClassifierType[ClassConstructorDescriptorImpl]

'it' @ [95:49] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-supertypes>.<anonymous>[ValueParameterDescriptorImpl]

'classOrObject' @ [98:17] ==> private final val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.javac.MockKotlinClassifier[PropertyDescriptorImpl]

'declarations' @ [98:31] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [98:44] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'mapNotNull' @ [99:18] ==> public inline fun <T, R : Any> Iterable<KtClassOrObject>.mapNotNull(transform: (KtClassOrObject) -> JavaClass?): List<JavaClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R : Any> -> JavaClass

'nestedClassOrObject' @ [100:21] ==> value-parameter nestedClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-innerClasses>.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [100:41] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'let' @ [100:49] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> JavaClass?): JavaClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> JavaClass?

'javac' @ [101:25] ==> private final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.MockKotlinClassifier[PropertyDescriptorImpl]

'getKotlinClassifier' @ [101:31] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'it' @ [101:51] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.<get-innerClasses>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [106:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [109:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [112:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [115:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'SOURCE' @ [118:38] ==> enum entry SOURCE defined in org.jetbrains.kotlin.load.java.structure.LightClassOriginKind[FakeCallableDescriptorForObject]

'UnsupportedOperationException' @ [124:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [127:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [130:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'fqName' @ [133:17] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.javac.MockKotlinClassifier[PropertyDescriptorImpl]

'shortNameOrSpecial' @ [133:24] ==> @NotNull public open fun shortNameOrSpecial(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'UnsupportedOperationException' @ [136:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [139:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [144:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'innerClasses' @ [147:17] ==> public final val innerClasses: Collection<JavaClass> defined in org.jetbrains.kotlin.javac.MockKotlinClassifier[PropertyDescriptorImpl]

'map' @ [147:30] ==> public inline fun <T, R> Iterable<JavaClass>.map(transform: (JavaClass) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Name

'innerClasses' @ [150:13] ==> public final val innerClasses: Collection<JavaClass> defined in org.jetbrains.kotlin.javac.MockKotlinClassifier[PropertyDescriptorImpl]

'find' @ [150:26] ==> @InlineOnly public inline fun <T> Iterable<JavaClass>.find(predicate: (JavaClass) -> Boolean): JavaClass? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass

'it' @ [150:33] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.findInnerClass.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [150:36] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'name' @ [150:44] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.MockKotlinClassifier.findInnerClass[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [157:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [160:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [163:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [166:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [169:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [172:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [175:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'name' @ [182:21] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'split' @ [182:26] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [183:18] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'containingKtFile' @ [183:32] ==> public final val KtClassOrObject.containingKtFile: KtFile[MyPropertyDescriptor]

'tryToResolveInner' @ [185:5] ==> private fun tryToResolveInner(name: String, classOrObject: KtClassOrObject, javac: JavacWrapper, nameParts: List<String>): JavaClass? defined in org.jetbrains.kotlin.javac[SimpleFunctionDescriptorImpl]

'name' @ [185:23] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'classOrObject' @ [185:29] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'javac' @ [185:44] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'nameParts' @ [185:51] ==> val nameParts: List<String> defined in org.jetbrains.kotlin.javac.resolveSupertype[LocalVariableDescriptor]

'let' @ [185:63] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [185:76] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.resolveSupertype.<anonymous>[ValueParameterDescriptorImpl]

'ktFile' @ [186:5] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.javac.resolveSupertype[LocalVariableDescriptor]

'tryToResolvePackageClass' @ [186:12] ==> private fun KtFile.tryToResolvePackageClass(name: String, javac: JavacWrapper, nameParts: List<String> = ...): JavaClass? defined in org.jetbrains.kotlin.javac[SimpleFunctionDescriptorImpl]

'name' @ [186:37] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'javac' @ [186:43] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'nameParts' @ [186:50] ==> val nameParts: List<String> defined in org.jetbrains.kotlin.javac.resolveSupertype[LocalVariableDescriptor]

'let' @ [186:62] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [186:75] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.resolveSupertype.<anonymous>[ValueParameterDescriptorImpl]

'tryToResolveByFqName' @ [187:5] ==> public fun tryToResolveByFqName(name: String, javac: JavacWrapper): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'name' @ [187:26] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'javac' @ [187:32] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'let' @ [187:40] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [187:53] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.resolveSupertype.<anonymous>[ValueParameterDescriptorImpl]

'ktFile' @ [188:5] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.javac.resolveSupertype[LocalVariableDescriptor]

'tryToResolveSingleTypeImport' @ [188:12] ==> private fun KtFile.tryToResolveSingleTypeImport(name: String, javac: JavacWrapper, nameParts: List<String> = ...): JavaClass? defined in org.jetbrains.kotlin.javac[SimpleFunctionDescriptorImpl]

'name' @ [188:41] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'javac' @ [188:47] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'nameParts' @ [188:54] ==> val nameParts: List<String> defined in org.jetbrains.kotlin.javac.resolveSupertype[LocalVariableDescriptor]

'let' @ [188:66] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [188:79] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.resolveSupertype.<anonymous>[ValueParameterDescriptorImpl]

'ktFile' @ [189:5] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.javac.resolveSupertype[LocalVariableDescriptor]

'tryToResolveTypeImportOnDemand' @ [189:12] ==> private fun KtFile.tryToResolveTypeImportOnDemand(name: String, javac: JavacWrapper, nameParts: List<String> = ...): JavaClass? defined in org.jetbrains.kotlin.javac[SimpleFunctionDescriptorImpl]

'name' @ [189:43] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'javac' @ [189:49] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'nameParts' @ [189:56] ==> val nameParts: List<String> defined in org.jetbrains.kotlin.javac.resolveSupertype[LocalVariableDescriptor]

'let' @ [189:68] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [189:81] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.resolveSupertype.<anonymous>[ValueParameterDescriptorImpl]

'tryToResolveInJavaLang' @ [190:5] ==> public fun tryToResolveInJavaLang(name: String, javac: JavacWrapper): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'name' @ [190:28] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'javac' @ [190:34] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.resolveSupertype[ValueParameterDescriptorImpl]

'let' @ [190:42] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [190:55] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.resolveSupertype.<anonymous>[ValueParameterDescriptorImpl]

'classOrObject' @ [199:9] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.javac.tryToResolveInner[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [199:23] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'let' @ [199:48] ==> @InlineOnly public inline fun <T, R> KtClassOrObject.let(block: (KtClassOrObject) -> JavaClass?): JavaClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> JavaClass?

'containingClass' @ [200:13] ==> value-parameter containingClass: KtClassOrObject defined in org.jetbrains.kotlin.javac.tryToResolveInner.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [200:29] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'let' @ [200:37] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> JavaClass?): JavaClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> JavaClass?

'javac' @ [201:17] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolveInner[ValueParameterDescriptorImpl]

'findClass' @ [201:23] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'it' @ [201:33] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.javac.tryToResolveInner.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [201:40] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolveInner[ValueParameterDescriptorImpl]

'getKotlinClassifier' @ [201:46] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'it' @ [201:66] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.javac.tryToResolveInner.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'findInner' @ [203:12] ==> public fun JavaClass.findInner(name: String, javac: JavacWrapper, nameParts: List<String> = ...): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'name' @ [203:22] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.tryToResolveInner[ValueParameterDescriptorImpl]

'javac' @ [203:28] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolveInner[ValueParameterDescriptorImpl]

'nameParts' @ [203:35] ==> value-parameter nameParts: List<String> defined in org.jetbrains.kotlin.javac.tryToResolveInner[ValueParameterDescriptorImpl]

'emptyList' @ [207:64] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (nameParts.size > 1) {
        find(FqName("${packageFqName.asString()}.${nameParts.first()}"), javac, nameParts)
    }
    else {
        javac.findClass(FqName("${packageFqName.asString()}.$name"))
        ?: javac.getKotlinClassifier(FqName("${packageFqName.asString()}.$name"))
    }' @ [208:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JavaClass?, elseBranch: JavaClass?): JavaClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JavaClass?

'nameParts' @ [208:16] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'size' @ [208:26] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'find' @ [209:9] ==> public fun find(fqName: FqName, javac: JavacWrapper, nameParts: List<String>): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'FqName' @ [209:14] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageFqName' @ [209:24] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'asString' @ [209:38] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'nameParts' @ [209:52] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'first' @ [209:62] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'javac' @ [209:74] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'nameParts' @ [209:81] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'javac' @ [212:9] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'findClass' @ [212:15] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'FqName' @ [212:25] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageFqName' @ [212:35] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'asString' @ [212:49] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [212:62] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'javac' @ [213:12] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'getKotlinClassifier' @ [213:18] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'FqName' @ [213:38] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageFqName' @ [213:48] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'asString' @ [213:62] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [213:75] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'emptyList' @ [219:75] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (nameParts.size > 1) {
        val foundImports = importDirectives.filter { it.text.endsWith(".${nameParts.first()}") }
        foundImports.forEach { importDirective ->
            importDirective.importedFqName?.let { importedFqName ->
                find(importedFqName, javac, nameParts)?.let { importedClass ->
                    return importedClass
                }
            }
        }
        return null
    }
    else {
        return importDirectives.find { importDirective ->
            importDirective.text.endsWith(".$name")
        }?.let { importDirective ->
            importDirective.importedFqName?.let { fqName ->
                javac.findClass(fqName) ?: javac.getKotlinClassifier(fqName)
            }
        }
    }' @ [220:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'nameParts' @ [220:9] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'size' @ [220:19] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'importDirectives' @ [221:28] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'filter' @ [221:45] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.filter(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): List<(KtImportDirective..KtImportDirective?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'it' @ [221:54] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [221:57] ==> public final val KtImportDirective.text: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [221:62] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'nameParts' @ [221:75] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'first' @ [221:85] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'foundImports' @ [222:9] ==> val foundImports: List<(KtImportDirective..KtImportDirective?)> defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport[LocalVariableDescriptor]

'forEach' @ [222:22] ==> @HidesMembers public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.forEach(action: ((KtImportDirective..KtImportDirective?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'importDirective' @ [223:13] ==> value-parameter importDirective: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport.<anonymous>[ValueParameterDescriptorImpl]

'importedFqName' @ [223:29] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'let' @ [223:45] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> Nothing?

'find' @ [224:17] ==> public fun find(fqName: FqName, javac: JavacWrapper, nameParts: List<String>): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'importedFqName' @ [224:22] ==> value-parameter importedFqName: FqName defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [224:38] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'nameParts' @ [224:45] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'let' @ [224:57] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing?

'importedClass' @ [225:28] ==> value-parameter importedClass: JavaClass defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'importDirectives' @ [232:16] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'find' @ [232:33] ==> @InlineOnly public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.find(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): KtImportDirective? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'importDirective' @ [233:13] ==> value-parameter importDirective: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [233:29] ==> public final val KtImportDirective.text: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [233:34] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [233:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'let' @ [234:12] ==> @InlineOnly public inline fun <T, R> KtImportDirective.let(block: (KtImportDirective) -> JavaClass?): JavaClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective
    <R> -> JavaClass?

'importDirective' @ [235:13] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport.<anonymous>[ValueParameterDescriptorImpl]

'importedFqName' @ [235:29] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'let' @ [235:45] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> JavaClass?): JavaClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> JavaClass?

'javac' @ [236:17] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'findClass' @ [236:23] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [236:33] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [236:44] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'getKotlinClassifier' @ [236:50] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [236:70] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.tryToResolveSingleTypeImport.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [244:77] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'importDirectives' @ [245:32] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'filter' @ [245:49] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.filter(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): List<(KtImportDirective..KtImportDirective?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'it' @ [245:58] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [245:61] ==> public final val KtImportDirective.text: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [245:66] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (nameParts.size > 1) {
        packagesWithAsterisk.forEach { importDirective ->
            find(FqName("${importDirective.importedFqName?.asString()}.${nameParts.first()}"),
                 javac,
                 nameParts)?.let { return it }
        }
        return null
    }
    else {
        packagesWithAsterisk.forEach { importDirective ->
            val fqName = "${importDirective.importedFqName?.asString()}.$name".let(::FqName)
            javac.findClass(fqName)?.let { return it } ?: javac.getKotlinClassifier(fqName)?.let { return it }
        }

        return null
    }' @ [247:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'nameParts' @ [247:9] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'size' @ [247:19] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'packagesWithAsterisk' @ [248:9] ==> val packagesWithAsterisk: List<(KtImportDirective..KtImportDirective?)> defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand[LocalVariableDescriptor]

'forEach' @ [248:30] ==> @HidesMembers public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.forEach(action: ((KtImportDirective..KtImportDirective?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'find' @ [249:13] ==> public fun find(fqName: FqName, javac: JavacWrapper, nameParts: List<String>): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'FqName' @ [249:18] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'importDirective' @ [249:28] ==> value-parameter importDirective: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand.<anonymous>[ValueParameterDescriptorImpl]

'importedFqName' @ [249:44] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'asString' @ [249:60] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'nameParts' @ [249:74] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'first' @ [249:84] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'javac' @ [250:18] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'nameParts' @ [251:18] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'let' @ [251:30] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [251:43] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'packagesWithAsterisk' @ [256:9] ==> val packagesWithAsterisk: List<(KtImportDirective..KtImportDirective?)> defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand[LocalVariableDescriptor]

'forEach' @ [256:30] ==> @HidesMembers public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.forEach(action: ((KtImportDirective..KtImportDirective?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'importDirective' @ [257:29] ==> value-parameter importDirective: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand.<anonymous>[ValueParameterDescriptorImpl]

'importedFqName' @ [257:45] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'asString' @ [257:61] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [257:74] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'let' @ [257:80] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'javac' @ [258:13] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'findClass' @ [258:19] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [258:29] ==> val fqName: FqName defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand.<anonymous>[LocalVariableDescriptor]

'let' @ [258:38] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing?

'it' @ [258:51] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [258:59] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'getKotlinClassifier' @ [258:65] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [258:85] ==> val fqName: FqName defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand.<anonymous>[LocalVariableDescriptor]

'let' @ [258:94] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing?

'it' @ [258:107] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.tryToResolveTypeImportOnDemand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

