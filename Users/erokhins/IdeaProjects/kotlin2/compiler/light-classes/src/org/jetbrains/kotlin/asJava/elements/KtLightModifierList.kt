'KtLightElementBase' @ [39:7] ==> public constructor KtLightElementBase(parent: PsiElement) defined in org.jetbrains.kotlin.asJava.elements.KtLightElementBase[ClassConstructorDescriptorImpl]

'owner' @ [39:26] ==> value-parameter owner: T defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList.<init>[ValueParameterDescriptorImpl]

'lazyPub' @ [40:33] ==> public fun <T> lazyPub(initializer: () -> PsiModifierList): Lazy<PsiModifierList> defined in org.jetbrains.kotlin.asJava.classes[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PsiModifierList

'owner' @ [40:43] ==> protected final val owner: T defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'clsDelegate' @ [40:49] ==> public abstract val clsDelegate: PsiModifierListOwner defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[PropertyDescriptorImpl]

'modifierList' @ [40:61] ==> public final val PsiModifierListOwner.modifierList: PsiModifierList?[MyPropertyDescriptor]

'lazyPub' @ [41:33] ==> public fun <T> lazyPub(initializer: () -> List<KtLightAbstractAnnotation>): Lazy<List<KtLightAbstractAnnotation>> defined in org.jetbrains.kotlin.asJava.classes[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<KtLightAbstractAnnotation>

'computeAnnotations' @ [41:43] ==> private fun computeAnnotations(lightModifierList: KtLightModifierList<*>): List<KtLightAbstractAnnotation> defined in org.jetbrains.kotlin.asJava.elements[SimpleFunctionDescriptorImpl]

'this' @ [41:62] ==> <this> defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[LazyClassReceiverParameterDescriptor]

'owner' @ [44:17] ==> protected final val owner: T defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'kotlinOrigin' @ [44:23] ==> public abstract val kotlinOrigin: KtModifierListOwner? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[PropertyDescriptorImpl]

'modifierList' @ [44:37] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'owner' @ [46:32] ==> protected final val owner: T defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'hasModifierProperty' @ [48:54] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String): Boolean defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[JavaMethodDescriptor]

'name' @ [48:74] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList.hasExplicitModifier[ValueParameterDescriptorImpl]

'clsDelegate' @ [50:70] ==> public open val clsDelegate: PsiModifierList defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'setModifierProperty' @ [50:82] ==> public abstract fun setModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'name' @ [50:102] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList.setModifierProperty[ValueParameterDescriptorImpl]

'value' @ [50:108] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList.setModifierProperty[ValueParameterDescriptorImpl]

'clsDelegate' @ [51:75] ==> public open val clsDelegate: PsiModifierList defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'checkSetModifierProperty' @ [51:87] ==> public abstract fun checkSetModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'name' @ [51:112] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList.checkSetModifierProperty[ValueParameterDescriptorImpl]

'value' @ [51:118] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList.checkSetModifierProperty[ValueParameterDescriptorImpl]

'clsDelegate' @ [52:57] ==> public open val clsDelegate: PsiModifierList defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'addAnnotation' @ [52:69] ==> @NotNull public abstract fun addAnnotation(@NotNull @NonNls p0: String): PsiAnnotation defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'qualifiedName' @ [52:83] ==> value-parameter qualifiedName: String defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList.addAnnotation[ValueParameterDescriptorImpl]

'annotations' @ [54:73] ==> public final val <out T : KtLightElement<KtModifierListOwner, PsiModifierListOwner>> KtLightModifierList<T>.annotations: Array<out PsiAnnotation>[MyPropertyDescriptor]
Inferred types:
    <out T : KtLightElement<KtModifierListOwner, PsiModifierListOwner>> -> T

'_annotations' @ [56:63] ==> private final val _annotations: List<KtLightAbstractAnnotation> defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'toTypedArray' @ [56:76] ==> public inline fun <reified T> Collection<KtLightAbstractAnnotation>.toTypedArray(): Array<KtLightAbstractAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtLightAbstractAnnotation

'_annotations' @ [57:58] ==> private final val _annotations: List<KtLightAbstractAnnotation> defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'firstOrNull' @ [57:71] ==> public inline fun <T> Iterable<KtLightAbstractAnnotation>.firstOrNull(predicate: (KtLightAbstractAnnotation) -> Boolean): KtLightAbstractAnnotation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightAbstractAnnotation

'it' @ [57:85] ==> value-parameter it: KtLightAbstractAnnotation defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'fqNameMatches' @ [57:88] ==> public open fun fqNameMatches(fqName: String): Boolean defined in org.jetbrains.kotlin.asJava.elements.KtLightAbstractAnnotation[SimpleFunctionDescriptorImpl]

'qualifiedName' @ [57:102] ==> value-parameter qualifiedName: String defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList.findAnnotation[ValueParameterDescriptorImpl]

'another' @ [60:13] ==> value-parameter another: PsiElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList.isEquivalentTo[ValueParameterDescriptorImpl]

'owner' @ [60:50] ==> protected final val owner: T defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'another' @ [60:59] ==> value-parameter another: PsiElement? defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList.isEquivalentTo[ValueParameterDescriptorImpl]

'owner' @ [60:67] ==> protected final val owner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'owner' @ [64:56] ==> protected final val owner: T defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'KtLightModifierList<KtLightElement<KtModifierListOwner, PsiModifierListOwner>>' @ [69:5] ==> public constructor KtLightModifierList<out T : KtLightElement<KtModifierListOwner, PsiModifierListOwner>>(owner: KtLightElement<KtModifierListOwner, PsiModifierListOwner>) defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : KtLightElement<KtModifierListOwner, PsiModifierListOwner>> -> KtLightElement<KtModifierListOwner, PsiModifierListOwner>

'owner' @ [69:84] ==> value-parameter owner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.KtLightSimpleModifierList.<init>[ValueParameterDescriptorImpl]

'name' @ [70:54] ==> value-parameter name: String defined in org.jetbrains.kotlin.asJava.elements.KtLightSimpleModifierList.hasModifierProperty[ValueParameterDescriptorImpl]

'modifiers' @ [70:62] ==> private final val modifiers: Set<String> defined in org.jetbrains.kotlin.asJava.elements.KtLightSimpleModifierList[PropertyDescriptorImpl]

'KtLightSimpleModifierList' @ [72:27] ==> public constructor KtLightSimpleModifierList(owner: KtLightElement<KtModifierListOwner, PsiModifierListOwner>, modifiers: Set<String>) defined in org.jetbrains.kotlin.asJava.elements.KtLightSimpleModifierList[ClassConstructorDescriptorImpl]

'owner' @ [72:53] ==> protected final val owner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.KtLightSimpleModifierList[PropertyDescriptorImpl]

'modifiers' @ [72:60] ==> private final val modifiers: Set<String> defined in org.jetbrains.kotlin.asJava.elements.KtLightSimpleModifierList[PropertyDescriptorImpl]

'lightAnnotationsForEntries' @ [76:33] ==> private fun lightAnnotationsForEntries(lightModifierList: KtLightModifierList<*>): List<KtLightAnnotationForSourceEntry> defined in org.jetbrains.kotlin.asJava.elements[SimpleFunctionDescriptorImpl]

'lightModifierList' @ [76:60] ==> value-parameter lightModifierList: KtLightModifierList<*> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[ValueParameterDescriptorImpl]

'lightModifierList' @ [77:29] ==> value-parameter lightModifierList: KtLightModifierList<*> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[ValueParameterDescriptorImpl]

'parent' @ [77:47] ==> public final val <out T : KtLightElement<KtModifierListOwner, PsiModifierListOwner>> KtLightModifierList<KtLightElement<KtModifierListOwner, PsiModifierListOwner>>.parent: KtLightElement<KtModifierListOwner, PsiModifierListOwner>[MyPropertyDescriptor]
Inferred types:
    <out T : KtLightElement<KtModifierListOwner, PsiModifierListOwner>> -> KtLightElement<KtModifierListOwner, PsiModifierListOwner>

'modifierListOwner' @ [78:9] ==> val modifierListOwner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'modifierListOwner' @ [78:66] ==> val modifierListOwner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'isAnnotationType' @ [78:84] ==> public final val KtLightClassForSourceDeclaration.isAnnotationType: Boolean[MyPropertyDescriptor]

'annotationsForEntries' @ [79:37] ==> val annotationsForEntries: List<KtLightAnnotationForSourceEntry> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'mapTo' @ [79:59] ==> public inline fun <T, R, C : MutableCollection<in String>> Iterable<KtLightAnnotationForSourceEntry>.mapTo(destination: MutableSet<String>, transform: (KtLightAnnotationForSourceEntry) -> String): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightAnnotationForSourceEntry
    <R> -> String
    <C : MutableCollection<in R>> -> MutableSet<String>

'mutableSetOf' @ [79:65] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [79:83] ==> value-parameter it: KtLightAnnotationForSourceEntry defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [79:86] ==> public final val KtLightAnnotationForSourceEntry.qualifiedName: String[MyPropertyDescriptor]

'modifierListOwner' @ [80:51] ==> val modifierListOwner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'clsDelegate' @ [80:69] ==> public open val clsDelegate: PsiClass defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForSourceDeclaration[PropertyDescriptorImpl]

'modifierList' @ [80:81] ==> public final val PsiClass.modifierList: PsiModifierList?[MyPropertyDescriptor]

'annotations' @ [80:95] ==> public final val PsiModifierList.annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>)[MyPropertyDescriptor]

'orEmpty' @ [80:107] ==> public inline fun <reified T> Array<out (PsiAnnotation..PsiAnnotation?)>?.orEmpty(): Array<out (PsiAnnotation..PsiAnnotation?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'filter' @ [80:117] ==> public inline fun <T> Array<out (PsiAnnotation..PsiAnnotation?)>.filter(predicate: ((PsiAnnotation..PsiAnnotation?)) -> Boolean): List<(PsiAnnotation..PsiAnnotation?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'it' @ [81:13] ==> value-parameter it: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [81:16] ==> public final val PsiAnnotation.qualifiedName: String?[MyPropertyDescriptor]

'sourceAnnotationNames' @ [81:34] ==> val sourceAnnotationNames: MutableSet<String> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'map' @ [82:11] ==> public inline fun <T, R> Iterable<(PsiAnnotation..PsiAnnotation?)>.map(transform: ((PsiAnnotation..PsiAnnotation?)) -> KtLightNonSourceAnnotation): List<KtLightNonSourceAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)
    <R> -> KtLightNonSourceAnnotation

'KtLightNonSourceAnnotation' @ [82:17] ==> public constructor KtLightNonSourceAnnotation(parent: PsiElement, clsDelegate: PsiAnnotation) defined in org.jetbrains.kotlin.asJava.elements.KtLightNonSourceAnnotation[ClassConstructorDescriptorImpl]

'lightModifierList' @ [82:44] ==> value-parameter lightModifierList: KtLightModifierList<*> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[ValueParameterDescriptorImpl]

'it' @ [82:63] ==> value-parameter it: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'annotationsForEntries' @ [83:16] ==> val annotationsForEntries: List<KtLightAnnotationForSourceEntry> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'specialAnnotationsOnAnnotationClass' @ [83:40] ==> val specialAnnotationsOnAnnotationClass: List<KtLightNonSourceAnnotation> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'modifierListOwner' @ [85:10] ==> val modifierListOwner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'modifierListOwner' @ [85:51] ==> val modifierListOwner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'modifierListOwner' @ [86:12] ==> val modifierListOwner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'annotationsForEntries' @ [87:16] ==> val annotationsForEntries: List<KtLightAnnotationForSourceEntry> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'Suppress' @ [88:16] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'listOf' @ [89:16] ==> public fun <T> listOf(element: KtLightNullabilityAnnotation): List<KtLightNullabilityAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightNullabilityAnnotation

'KtLightNullabilityAnnotation' @ [89:23] ==> public constructor KtLightNullabilityAnnotation(member: KtLightElement<*, PsiModifierListOwner>, parent: PsiElement) defined in org.jetbrains.kotlin.asJava.elements.KtLightNullabilityAnnotation[ClassConstructorDescriptorImpl]

'modifierListOwner' @ [89:52] ==> val modifierListOwner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'lightModifierList' @ [89:114] ==> value-parameter lightModifierList: KtLightModifierList<*> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[ValueParameterDescriptorImpl]

'annotationsForEntries' @ [91:12] ==> val annotationsForEntries: List<KtLightAnnotationForSourceEntry> defined in org.jetbrains.kotlin.asJava.elements.computeAnnotations[LocalVariableDescriptor]

'lightModifierList' @ [95:34] ==> value-parameter lightModifierList: KtLightModifierList<*> defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries[ValueParameterDescriptorImpl]

'parent' @ [95:52] ==> public final val <out T : KtLightElement<KtModifierListOwner, PsiModifierListOwner>> KtLightModifierList<KtLightElement<KtModifierListOwner, PsiModifierListOwner>>.parent: KtLightElement<KtModifierListOwner, PsiModifierListOwner>[MyPropertyDescriptor]
Inferred types:
    <out T : KtLightElement<KtModifierListOwner, PsiModifierListOwner>> -> KtLightElement<KtModifierListOwner, PsiModifierListOwner>

'lightModifierListOwner' @ [96:34] ==> val lightModifierListOwner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries[LocalVariableDescriptor]

'kotlinOrigin' @ [96:57] ==> public abstract val kotlinOrigin: KtModifierListOwner? defined in org.jetbrains.kotlin.asJava.elements.KtLightElement[PropertyDescriptorImpl]

'annotatedKtDeclaration' @ [98:9] ==> val annotatedKtDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries[LocalVariableDescriptor]

'!' @ [98:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'annotatedKtDeclaration' @ [98:44] ==> val annotatedKtDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries[LocalVariableDescriptor]

'isValid' @ [98:67] ==> public final val KtDeclaration.isValid: Boolean[MyPropertyDescriptor]

'!' @ [98:78] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasAnnotationsInSource' @ [98:79] ==> private fun hasAnnotationsInSource(declaration: KtDeclaration): Boolean defined in org.jetbrains.kotlin.asJava.elements in file KtLightModifierList.kt[SimpleFunctionDescriptorImpl]

'annotatedKtDeclaration' @ [98:102] ==> val annotatedKtDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries[LocalVariableDescriptor]

'emptyList' @ [99:16] ==> public fun <T> emptyList(): List<KtLightAnnotationForSourceEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightAnnotationForSourceEntry

'getAnnotationDescriptors' @ [102:12] ==> private fun getAnnotationDescriptors(declaration: KtDeclaration, annotatedLightElement: KtLightElement<*, *>): List<AnnotationDescriptor> defined in org.jetbrains.kotlin.asJava.elements[SimpleFunctionDescriptorImpl]

'annotatedKtDeclaration' @ [102:37] ==> val annotatedKtDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries[LocalVariableDescriptor]

'lightModifierListOwner' @ [102:61] ==> val lightModifierListOwner: KtLightElement<KtModifierListOwner, PsiModifierListOwner> defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries[LocalVariableDescriptor]

'mapNotNull' @ [103:14] ==> public inline fun <T, R : Any> Iterable<AnnotationDescriptor>.mapNotNull(transform: (AnnotationDescriptor) -> Pair<String, KtAnnotationEntry>?): List<Pair<String, KtAnnotationEntry>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R : Any> -> Pair<String, KtAnnotationEntry>

'descriptor' @ [104:30] ==> value-parameter descriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [104:41] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'asString' @ [104:49] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'descriptor' @ [105:29] ==> value-parameter descriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [105:40] ==> public abstract val source: SourceElement defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'getPsi' @ [105:47] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'Pair' @ [106:17] ==> public constructor Pair<out A, out B>(first: String, second: KtAnnotationEntry) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> KtAnnotationEntry

'fqName' @ [106:22] ==> val fqName: String defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>[LocalVariableDescriptor]

'entry' @ [106:30] ==> val entry: KtAnnotationEntry defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>[LocalVariableDescriptor]

'groupBy' @ [108:14] ==> public inline fun <T, K, V> Iterable<Pair<String, KtAnnotationEntry>>.groupBy(keySelector: (Pair<String, KtAnnotationEntry>) -> String, valueTransform: (Pair<String, KtAnnotationEntry>) -> KtAnnotationEntry): Map<String, List<KtAnnotationEntry>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, KtAnnotationEntry>
    <K> -> String
    <V> -> KtAnnotationEntry

'it' @ [108:24] ==> value-parameter it: Pair<String, KtAnnotationEntry> defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [108:27] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [108:38] ==> value-parameter it: Pair<String, KtAnnotationEntry> defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [108:41] ==> public final val second: KtAnnotationEntry defined in kotlin.Pair[DeserializedPropertyDescriptor]

'flatMap' @ [109:14] ==> public inline fun <K, V, R> Map<out String, List<KtAnnotationEntry>>.flatMap(transform: (Map.Entry<String, List<KtAnnotationEntry>>) -> Iterable<KtLightAnnotationForSourceEntry>): List<KtLightAnnotationForSourceEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<KtAnnotationEntry>
    <R> -> KtLightAnnotationForSourceEntry

'component1' @ [110:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<KtAnnotationEntry>>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<KtAnnotationEntry>

'component2' @ [110:26] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<KtAnnotationEntry>>.component2(): List<KtAnnotationEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<KtAnnotationEntry>

'entries' @ [111:17] ==> val entries: List<KtAnnotationEntry> defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>[LocalVariableDescriptor]

'mapIndexed' @ [111:25] ==> public inline fun <T, R> Iterable<KtAnnotationEntry>.mapIndexed(transform: (index: Int, KtAnnotationEntry) -> KtLightAnnotationForSourceEntry): List<KtLightAnnotationForSourceEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry
    <R> -> KtLightAnnotationForSourceEntry

'KtLightAnnotationForSourceEntry' @ [112:21] ==> public constructor KtLightAnnotationForSourceEntry(qualifiedName: String, kotlinOrigin: KtCallElement, parent: PsiElement, computeDelegate: () -> PsiAnnotation) defined in org.jetbrains.kotlin.asJava.elements.KtLightAnnotationForSourceEntry[ClassConstructorDescriptorImpl]

'fqName' @ [112:53] ==> val fqName: String defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>[LocalVariableDescriptor]

'entry' @ [112:61] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lightModifierList' @ [112:68] ==> value-parameter lightModifierList: KtLightModifierList<*> defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries[ValueParameterDescriptorImpl]

'lightModifierList' @ [113:25] ==> value-parameter lightModifierList: KtLightModifierList<*> defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries[ValueParameterDescriptorImpl]

'clsDelegate' @ [113:43] ==> public open val clsDelegate: PsiModifierList defined in org.jetbrains.kotlin.asJava.elements.KtLightModifierList[PropertyDescriptorImpl]

'annotations' @ [113:55] ==> public final val PsiModifierList.annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>)[MyPropertyDescriptor]

'filter' @ [113:67] ==> public inline fun <T> Array<out (PsiAnnotation..PsiAnnotation?)>.filter(predicate: ((PsiAnnotation..PsiAnnotation?)) -> Boolean): List<(PsiAnnotation..PsiAnnotation?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'it' @ [113:76] ==> value-parameter it: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [113:79] ==> public final val PsiAnnotation.qualifiedName: String?[MyPropertyDescriptor]

'fqName' @ [113:96] ==> val fqName: String defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>[LocalVariableDescriptor]

'getOrNull' @ [113:105] ==> public fun <T> List<(PsiAnnotation..PsiAnnotation?)>.getOrNull(index: Int): PsiAnnotation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'index' @ [113:115] ==> value-parameter index: Int defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KtLightNonExistentAnnotation' @ [114:28] ==> public constructor KtLightNonExistentAnnotation(parent: KtLightElement<*, *>) defined in org.jetbrains.kotlin.asJava.elements.KtLightNonExistentAnnotation[ClassConstructorDescriptorImpl]

'lightModifierList' @ [114:57] ==> value-parameter lightModifierList: KtLightModifierList<*> defined in org.jetbrains.kotlin.asJava.elements.lightAnnotationsForEntries[ValueParameterDescriptorImpl]

'LightClassGenerationSupport' @ [121:19] ==> public companion object defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport[FakeCallableDescriptorForObject]

'getInstance' @ [121:47] ==> @JvmStatic public final fun getInstance(project: Project): LightClassGenerationSupport defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [121:59] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'project' @ [121:71] ==> public final val KtDeclaration.project: Project[MyPropertyDescriptor]

'analyze' @ [121:80] ==> public abstract fun analyze(element: KtElement): BindingContext defined in org.jetbrains.kotlin.asJava.LightClassGenerationSupport[SimpleFunctionDescriptorImpl]

'declaration' @ [121:88] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'if (declaration is KtParameter && declaration.isPropertyParameter()) {
        if (annotatedLightElement is KtLightParameter && annotatedLightElement.method.isConstructor)
            context[BindingContext.VALUE_PARAMETER, declaration]
        else
            context[BindingContext.PRIMARY_CONSTRUCTOR_PARAMETER, declaration]
    }
    else {
        context[BindingContext.DECLARATION_TO_DESCRIPTOR, declaration]
    }' @ [123:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor?, elseBranch: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor?

'declaration' @ [123:26] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'declaration' @ [123:56] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'isPropertyParameter' @ [123:68] ==> public fun KtParameter.isPropertyParameter(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (annotatedLightElement is KtLightParameter && annotatedLightElement.method.isConstructor)
            context[BindingContext.VALUE_PARAMETER, declaration]
        else
            context[BindingContext.PRIMARY_CONSTRUCTOR_PARAMETER, declaration]' @ [124:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VariableDescriptor?, elseBranch: VariableDescriptor?): VariableDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VariableDescriptor?

'annotatedLightElement' @ [124:13] ==> value-parameter annotatedLightElement: KtLightElement<*, *> defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'annotatedLightElement' @ [124:58] ==> value-parameter annotatedLightElement: KtLightElement<*, *> defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'method' @ [124:80] ==> public final val KtLightParameter.method: (KtLightMethod..KtLightMethod?)[MyPropertyDescriptor]

'isConstructor' @ [124:87] ==> public final val KtLightMethod.isConstructor: Boolean[MyPropertyDescriptor]

'context' @ [125:13] ==> val context: BindingContext defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[LocalVariableDescriptor]

'VALUE_PARAMETER' @ [125:36] ==> public final val VALUE_PARAMETER: (WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [125:53] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'context' @ [127:13] ==> val context: BindingContext defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[LocalVariableDescriptor]

'PRIMARY_CONSTRUCTOR_PARAMETER' @ [127:36] ==> public final val PRIMARY_CONSTRUCTOR_PARAMETER: (WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [127:67] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'context' @ [130:9] ==> val context: BindingContext defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [130:32] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [130:59] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'when {
        descriptor is ClassDescriptor && annotatedLightElement is KtLightMethod && annotatedLightElement.isConstructor -> descriptor.unsubstitutedPrimaryConstructor
        descriptor !is PropertyDescriptor || annotatedLightElement !is KtLightMethod -> descriptor
        annotatedLightElement.isGetter -> descriptor.getter
        annotatedLightElement.isSetter -> descriptor.setter
        else -> descriptor
    }' @ [133:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?, entry3: DeclarationDescriptor?, entry4: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'descriptor' @ [134:9] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[LocalVariableDescriptor]

'annotatedLightElement' @ [134:42] ==> value-parameter annotatedLightElement: KtLightElement<*, *> defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'annotatedLightElement' @ [134:84] ==> value-parameter annotatedLightElement: KtLightElement<*, *> defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'isConstructor' @ [134:106] ==> public final val KtLightMethod.isConstructor: Boolean[MyPropertyDescriptor]

'descriptor' @ [134:123] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [134:134] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'descriptor' @ [135:9] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[LocalVariableDescriptor]

'annotatedLightElement' @ [135:46] ==> value-parameter annotatedLightElement: KtLightElement<*, *> defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'descriptor' @ [135:89] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[LocalVariableDescriptor]

'annotatedLightElement' @ [136:9] ==> value-parameter annotatedLightElement: KtLightElement<*, *> defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'isGetter' @ [136:31] ==> public val KtLightMethod.isGetter: Boolean defined in org.jetbrains.kotlin.asJava.elements in file KtLightMethodImpl.kt[PropertyDescriptorImpl]

'descriptor' @ [136:43] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[LocalVariableDescriptor]

'getter' @ [136:54] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'annotatedLightElement' @ [137:9] ==> value-parameter annotatedLightElement: KtLightElement<*, *> defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'isSetter' @ [137:31] ==> public val KtLightMethod.isSetter: Boolean defined in org.jetbrains.kotlin.asJava.elements in file KtLightMethodImpl.kt[PropertyDescriptorImpl]

'descriptor' @ [137:43] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[LocalVariableDescriptor]

'setter' @ [137:54] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'descriptor' @ [138:17] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[LocalVariableDescriptor]

'emptyList' @ [139:17] ==> public fun <T> emptyList(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'annotatedDescriptor' @ [141:12] ==> val annotatedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[LocalVariableDescriptor]

'annotations' @ [141:32] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedPropertyDescriptor]

'getAllAnnotations' @ [141:44] ==> public abstract fun getAllAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'filter' @ [142:14] ==> public inline fun <T> Iterable<AnnotationWithTarget>.filter(predicate: (AnnotationWithTarget) -> Boolean): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'it' @ [142:23] ==> value-parameter it: AnnotationWithTarget defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'matches' @ [142:26] ==> private fun AnnotationWithTarget.matches(annotated: KtLightElement<*, *>): Boolean defined in org.jetbrains.kotlin.asJava.elements in file KtLightModifierList.kt[SimpleFunctionDescriptorImpl]

'annotatedLightElement' @ [142:34] ==> value-parameter annotatedLightElement: KtLightElement<*, *> defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors[ValueParameterDescriptorImpl]

'map' @ [143:14] ==> public inline fun <T, R> Iterable<AnnotationWithTarget>.map(transform: (AnnotationWithTarget) -> AnnotationDescriptor): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget
    <R> -> AnnotationDescriptor

'it' @ [143:20] ==> value-parameter it: AnnotationWithTarget defined in org.jetbrains.kotlin.asJava.elements.getAnnotationDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'annotation' @ [143:23] ==> public final val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedPropertyDescriptor]

'declaration' @ [147:9] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.hasAnnotationsInSource[ValueParameterDescriptorImpl]

'annotationEntries' @ [147:21] ==> public final val KtDeclaration.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [147:39] ==> @InlineOnly public inline fun <T> Collection<(KtAnnotationEntry..KtAnnotationEntry?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'declaration' @ [151:9] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.hasAnnotationsInSource[ValueParameterDescriptorImpl]

'declaration' @ [152:16] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.asJava.elements.hasAnnotationsInSource[ValueParameterDescriptorImpl]

'accessors' @ [152:28] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'any' @ [152:38] ==> public inline fun <T> Iterable<(KtPropertyAccessor..KtPropertyAccessor?)>.any(predicate: ((KtPropertyAccessor..KtPropertyAccessor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtPropertyAccessor..org.jetbrains.kotlin.psi.KtPropertyAccessor?)

'hasAnnotationsInSource' @ [152:44] ==> private fun hasAnnotationsInSource(declaration: KtDeclaration): Boolean defined in org.jetbrains.kotlin.asJava.elements in file KtLightModifierList.kt[SimpleFunctionDescriptorImpl]

'it' @ [152:67] ==> value-parameter it: (KtPropertyAccessor..KtPropertyAccessor?) defined in org.jetbrains.kotlin.asJava.elements.hasAnnotationsInSource.<anonymous>[ValueParameterDescriptorImpl]

'if (annotated is KtLightFieldImpl.KtLightFieldForDeclaration) {
        if (target == AnnotationUseSiteTarget.FIELD) return true

        if (target != null) return false

        val declarationSiteTargets = AnnotationChecker.applicableTargetSet(annotation)
        return KotlinTarget.FIELD in declarationSiteTargets && KotlinTarget.PROPERTY !in declarationSiteTargets
    }
    else if (annotated is KtLightParameter && annotated.method.isSetter) {
        return target == AnnotationUseSiteTarget.SETTER_PARAMETER
    }' @ [159:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'annotated' @ [159:9] ==> value-parameter annotated: KtLightElement<*, *> defined in org.jetbrains.kotlin.asJava.elements.matches[ValueParameterDescriptorImpl]

'target' @ [160:13] ==> public final val target: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedPropertyDescriptor]

'AnnotationUseSiteTarget' @ [160:23] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'FIELD' @ [160:47] ==> enum entry FIELD defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'target' @ [162:13] ==> public final val target: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedPropertyDescriptor]

'AnnotationChecker' @ [164:38] ==> public companion object defined in org.jetbrains.kotlin.resolve.AnnotationChecker[FakeCallableDescriptorForObject]

'applicableTargetSet' @ [164:56] ==> @JvmStatic public final fun applicableTargetSet(descriptor: AnnotationDescriptor): Set<KotlinTarget> defined in org.jetbrains.kotlin.resolve.AnnotationChecker.Companion[DeserializedSimpleFunctionDescriptor]

'annotation' @ [164:76] ==> public final val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedPropertyDescriptor]

'KotlinTarget' @ [165:16] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'FIELD' @ [165:29] ==> enum entry FIELD defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'declarationSiteTargets' @ [165:38] ==> val declarationSiteTargets: Set<KotlinTarget> defined in org.jetbrains.kotlin.asJava.elements.matches[LocalVariableDescriptor]

'KotlinTarget' @ [165:64] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'PROPERTY' @ [165:77] ==> enum entry PROPERTY defined in org.jetbrains.kotlin.descriptors.annotations.KotlinTarget[FakeCallableDescriptorForObject]

'declarationSiteTargets' @ [165:90] ==> val declarationSiteTargets: Set<KotlinTarget> defined in org.jetbrains.kotlin.asJava.elements.matches[LocalVariableDescriptor]

'annotated' @ [167:14] ==> value-parameter annotated: KtLightElement<*, *> defined in org.jetbrains.kotlin.asJava.elements.matches[ValueParameterDescriptorImpl]

'annotated' @ [167:47] ==> value-parameter annotated: KtLightElement<*, *> defined in org.jetbrains.kotlin.asJava.elements.matches[ValueParameterDescriptorImpl]

'method' @ [167:57] ==> public final val KtLightParameter.method: (KtLightMethod..KtLightMethod?)[MyPropertyDescriptor]

'isSetter' @ [167:64] ==> public val KtLightMethod.isSetter: Boolean defined in org.jetbrains.kotlin.asJava.elements in file KtLightMethodImpl.kt[PropertyDescriptorImpl]

'target' @ [168:16] ==> public final val target: AnnotationUseSiteTarget? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedPropertyDescriptor]

'AnnotationUseSiteTarget' @ [168:26] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'SETTER_PARAMETER' @ [168:50] ==> enum entry SETTER_PARAMETER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

