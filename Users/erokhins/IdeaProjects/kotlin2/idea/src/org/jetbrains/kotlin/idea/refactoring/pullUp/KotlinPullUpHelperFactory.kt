'sourceClass' @ [38:27] ==> public final val PullUpData.sourceClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'unwrapped' @ [38:39] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'targetClass' @ [39:27] ==> public final val PullUpData.targetClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'unwrapped' @ [39:39] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'membersToMove' @ [40:29] ==> public final val PullUpData.membersToMove: (MutableSet<(PsiMember..PsiMember?)>..Set<(PsiMember..PsiMember?)>?)[MyPropertyDescriptor]

'mapNotNull' @ [41:18] ==> public inline fun <T, R : Any> Iterable<(PsiMember..PsiMember?)>.mapNotNull(transform: ((PsiMember..PsiMember?)) -> KtNamedDeclaration?): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMember..com.intellij.psi.PsiMember?)
    <R : Any> -> KtNamedDeclaration

'it' @ [41:31] ==> value-parameter it: (PsiMember..PsiMember?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.toKotlinPullUpData.<anonymous>[ValueParameterDescriptorImpl]

'toKtDeclarationWrapperAware' @ [41:34] ==> internal fun PsiMember.toKtDeclarationWrapperAware(): KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'sortedBy' @ [42:18] ==> public inline fun <T, R : Comparable<Int>> Iterable<KtNamedDeclaration>.sortedBy(crossinline selector: (KtNamedDeclaration) -> Int?): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R : Comparable<R>> -> Int

'it' @ [42:29] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.toKotlinPullUpData.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [42:32] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'KotlinPullUpData' @ [43:16] ==> public constructor KotlinPullUpData(sourceClass: KtClassOrObject, targetClass: PsiNamedElement, membersToMove: Collection<KtNamedDeclaration>) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpData[ClassConstructorDescriptorImpl]

'sourceClass' @ [43:33] ==> val sourceClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.toKotlinPullUpData[LocalVariableDescriptor]

'targetClass' @ [43:46] ==> val targetClass: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.toKotlinPullUpData[LocalVariableDescriptor]

'membersToMove' @ [43:59] ==> val membersToMove: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.toKotlinPullUpData[LocalVariableDescriptor]

'!' @ [47:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'data' @ [47:14] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.createPullUpHelper[ValueParameterDescriptorImpl]

'sourceClass' @ [47:19] ==> public final val PullUpData.sourceClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'isInheritor' @ [47:31] ==> public abstract fun isInheritor(@NotNull p0: PsiClass, p1: Boolean): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'data' @ [47:43] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.createPullUpHelper[ValueParameterDescriptorImpl]

'targetClass' @ [47:48] ==> public final val PullUpData.targetClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'EmptyPullUpHelper' @ [47:75] ==> public object EmptyPullUpHelper : PullUpHelper<MemberInfoBase<PsiMember>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file EmptyPullUpHelper.kt[FakeCallableDescriptorForObject]

'data' @ [48:9] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.createPullUpHelper[ValueParameterDescriptorImpl]

'toKotlinPullUpData' @ [48:14] ==> private final fun PullUpData.toKotlinPullUpData(): KotlinPullUpData? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory[SimpleFunctionDescriptorImpl]

'let' @ [48:36] ==> @InlineOnly public inline fun <T, R> KotlinPullUpData.let(block: (KotlinPullUpData) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPullUpData
    <R> -> Nothing

'KotlinPullUpHelper' @ [48:49] ==> public constructor KotlinPullUpHelper(javaData: PullUpData, data: KotlinPullUpData) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelper[ClassConstructorDescriptorImpl]

'data' @ [48:68] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.createPullUpHelper[ValueParameterDescriptorImpl]

'it' @ [48:74] ==> value-parameter it: KotlinPullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.createPullUpHelper.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [50:13] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.createPullUpHelper[ValueParameterDescriptorImpl]

'targetClass' @ [50:18] ==> public final val PullUpData.targetClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'language' @ [50:30] ==> public final val PsiClass.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [50:57] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'data' @ [50:69] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.createPullUpHelper[ValueParameterDescriptorImpl]

'sourceClass' @ [50:74] ==> public final val PullUpData.sourceClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'language' @ [50:86] ==> public final val PsiClass.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [50:111] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'JavaToKotlinPostconversionPullUpHelper' @ [51:20] ==> public constructor JavaToKotlinPostconversionPullUpHelper(data: PullUpData) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPostconversionPullUpHelper[ClassConstructorDescriptorImpl]

'data' @ [51:59] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory.createPullUpHelper[ValueParameterDescriptorImpl]

'EmptyPullUpHelper' @ [54:16] ==> public object EmptyPullUpHelper : PullUpHelper<MemberInfoBase<PsiMember>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file EmptyPullUpHelper.kt[FakeCallableDescriptorForObject]

'!' @ [60:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'data' @ [60:14] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createJavaToKotlinPullUpHelper[ValueParameterDescriptorImpl]

'sourceClass' @ [60:19] ==> public final val PullUpData.sourceClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'isInheritor' @ [60:31] ==> public abstract fun isInheritor(@NotNull p0: PsiClass, p1: Boolean): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'data' @ [60:43] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createJavaToKotlinPullUpHelper[ValueParameterDescriptorImpl]

'targetClass' @ [60:48] ==> public final val PullUpData.targetClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'createDummyTargetClass' @ [61:32] ==> private final fun createDummyTargetClass(data: PullUpData): PsiClass? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory[SimpleFunctionDescriptorImpl]

'data' @ [61:55] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createJavaToKotlinPullUpHelper[ValueParameterDescriptorImpl]

'data' @ [62:54] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createJavaToKotlinPullUpHelper[ValueParameterDescriptorImpl]

'dummyTargetClass' @ [63:45] ==> val dummyTargetClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createJavaToKotlinPullUpHelper[LocalVariableDescriptor]

'JavaToKotlinPreconversionPullUpHelper' @ [65:16] ==> public constructor JavaToKotlinPreconversionPullUpHelper(data: PullUpData, dummyTargetClass: PsiClass, javaHelper: JavaPullUpHelper) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPreconversionPullUpHelper[ClassConstructorDescriptorImpl]

'data' @ [65:54] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createJavaToKotlinPullUpHelper[ValueParameterDescriptorImpl]

'dummyTargetClass' @ [65:60] ==> val dummyTargetClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createJavaToKotlinPullUpHelper[LocalVariableDescriptor]

'JavaPullUpHelper' @ [65:78] ==> public constructor JavaPullUpHelper(p0: (PullUpData..PullUpData?)) defined in com.intellij.refactoring.memberPullUp.JavaPullUpHelper[JavaClassConstructorDescriptor]

'dataForDelegate' @ [65:95] ==> val dataForDelegate: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createJavaToKotlinPullUpHelper[LocalVariableDescriptor]

'data' @ [69:27] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[ValueParameterDescriptorImpl]

'targetClass' @ [69:32] ==> public final val PullUpData.targetClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'unwrapped' @ [69:44] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'targetClass' @ [71:23] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'project' @ [71:35] ==> public final val KtClass.project: Project[MyPropertyDescriptor]

'targetClass' @ [72:29] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'containingKtFile' @ [72:41] ==> public final val KtClass.containingKtFile: KtFile[MyPropertyDescriptor]

'packageFqName' @ [72:58] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'asString' @ [72:72] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'getInstance' @ [73:40] ==> public open fun getInstance(p0: (Project..Project?)): (PsiFileFactory..PsiFileFactory?) defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'project' @ [73:52] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'createFileFromText' @ [73:61] ==> @NotNull public abstract fun createFileFromText(@NonNls @NotNull p0: String, @NotNull p1: FileType, @NotNull p2: CharSequence): PsiFile defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'INSTANCE' @ [75:30] ==> public final val INSTANCE: (JavaFileType..JavaFileType?) defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'if (targetPackage.isNotEmpty()) "package $targetPackage;\n" else ""' @ [76:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'targetPackage' @ [76:21] ==> val targetPackage: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'isNotEmpty' @ [76:35] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'targetPackage' @ [76:59] ==> val targetPackage: String defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'getInstance' @ [78:56] ==> public open fun getInstance(p0: (Project..Project?)): (PsiElementFactory..PsiElementFactory?) defined in com.intellij.psi.PsiElementFactory.SERVICE[JavaMethodDescriptor]

'project' @ [78:68] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'createJavaClass' @ [80:32] ==> public fun createJavaClass(klass: KtClass, targetClass: PsiClass?, forcePlainClass: Boolean = ...): PsiClass defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'targetClass' @ [80:48] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'targetClass' @ [81:28] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'parents' @ [81:40] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filterIsInstance' @ [81:48] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtClassOrObject> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'toList' @ [81:84] ==> public fun <T> Sequence<KtClassOrObject>.toList(): List<KtClassOrObject> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'asReversed' @ [81:93] ==> public fun <T> List<KtClassOrObject>.asReversed(): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'outerClasses' @ [83:13] ==> val outerClasses: List<KtClassOrObject> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'isEmpty' @ [83:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'dummyFile' @ [83:44] ==> val dummyFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'add' @ [83:54] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'dummyTargetClass' @ [83:58] ==> val dummyTargetClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'outerClasses' @ [85:31] ==> val outerClasses: List<KtClassOrObject> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'map' @ [85:44] ==> public inline fun <T, R> Iterable<KtClassOrObject>.map(transform: (KtClassOrObject) -> PsiClass): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> PsiClass

'elementFactory' @ [86:28] ==> val elementFactory: (PsiElementFactory..PsiElementFactory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'createClass' @ [86:43] ==> @NotNull public abstract fun createClass(@NonNls @NotNull p0: String): PsiClass defined in com.intellij.psi.PsiElementFactory[JavaMethodDescriptor]

'it' @ [86:55] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [86:58] ==> public final val KtClassOrObject.name: String?[MyPropertyDescriptor]

'!' @ [87:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [87:19] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [87:36] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass.<anonymous>[ValueParameterDescriptorImpl]

'isInner' @ [87:39] ==> public final fun isInner(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'psiClass' @ [88:17] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass.<anonymous>[LocalVariableDescriptor]

'modifierList' @ [88:26] ==> public final val PsiClass.modifierList: PsiModifierList?[MyPropertyDescriptor]

'setModifierProperty' @ [88:41] ==> public abstract fun setModifierProperty(@PsiModifier.ModifierConstant @NotNull @NonNls p0: String, p1: Boolean): Unit defined in com.intellij.psi.PsiModifierList[JavaMethodDescriptor]

'STATIC' @ [88:73] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'psiClass' @ [90:13] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass.<anonymous>[LocalVariableDescriptor]

'outerPsiClasses' @ [92:16] ==> val outerPsiClasses: List<PsiClass> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'drop' @ [93:18] ==> public fun <T> Iterable<PsiClass>.drop(n: Int): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'plus' @ [94:18] ==> public operator fun <T> Collection<PsiClass>.plus(element: PsiClass): List<PsiClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'dummyTargetClass' @ [94:23] ==> val dummyTargetClass: PsiClass defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'fold' @ [95:18] ==> public inline fun <T, R> Iterable<PsiClass>.fold(initial: (PsiElement..PsiElement?), operation: (acc: (PsiElement..PsiElement?), PsiClass) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'dummyFile' @ [95:23] ==> val dummyFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'add' @ [95:33] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'outerPsiClasses' @ [95:37] ==> val outerPsiClasses: List<PsiClass> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createDummyTargetClass[LocalVariableDescriptor]

'first' @ [95:53] ==> public fun <T> List<PsiClass>.first(): PsiClass defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'add' @ [95:75] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'data' @ [99:13] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createPullUpHelper[ValueParameterDescriptorImpl]

'sourceClass' @ [99:18] ==> public final val PullUpData.sourceClass: (PsiClass..PsiClass?)[MyPropertyDescriptor]

'KotlinPullUpHelperFactory' @ [99:54] ==> public constructor KotlinPullUpHelperFactory() defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory[ClassConstructorDescriptorImpl]

'createPullUpHelper' @ [99:82] ==> public open fun createPullUpHelper(data: PullUpData): PullUpHelper<*> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.KotlinPullUpHelperFactory[SimpleFunctionDescriptorImpl]

'data' @ [99:101] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createPullUpHelper[ValueParameterDescriptorImpl]

'createJavaToKotlinPullUpHelper' @ [101:9] ==> private final fun createJavaToKotlinPullUpHelper(data: PullUpData): PullUpHelper<*>? defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory[SimpleFunctionDescriptorImpl]

'data' @ [101:40] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createPullUpHelper[ValueParameterDescriptorImpl]

'let' @ [101:47] ==> @InlineOnly public inline fun <T, R> PullUpHelper<*>.let(block: (PullUpHelper<*>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PullUpHelper<*>
    <R> -> Nothing

'it' @ [101:60] ==> value-parameter it: PullUpHelper<*> defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createPullUpHelper.<anonymous>[ValueParameterDescriptorImpl]

'?:' @ [103:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PullUpHelper<*>?, right: PullUpHelper<*>): PullUpHelper<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PullUpHelper<*>

'INSTANCE' @ [103:29] ==> public final val INSTANCE: (LanguageExtension<(PullUpHelperFactory..PullUpHelperFactory?)>..LanguageExtension<(PullUpHelperFactory..PullUpHelperFactory?)>?) defined in com.intellij.refactoring.memberPullUp.PullUpHelper[JavaPropertyDescriptor]

'allForLanguage' @ [104:25] ==> @NotNull public open fun allForLanguage(@NotNull p0: Language): (MutableList<(PullUpHelperFactory..PullUpHelperFactory?)>..List<(PullUpHelperFactory..PullUpHelperFactory?)>) defined in com.intellij.lang.LanguageExtension[JavaMethodDescriptor]

'INSTANCE' @ [104:53] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'firstOrNull' @ [105:25] ==> public inline fun <T> Iterable<(PullUpHelperFactory..PullUpHelperFactory?)>.firstOrNull(predicate: ((PullUpHelperFactory..PullUpHelperFactory?)) -> Boolean): PullUpHelperFactory? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.refactoring.memberPullUp.PullUpHelperFactory..com.intellij.refactoring.memberPullUp.PullUpHelperFactory?)

'it' @ [105:39] ==> value-parameter it: (PullUpHelperFactory..PullUpHelperFactory?) defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createPullUpHelper.<anonymous>[ValueParameterDescriptorImpl]

'createPullUpHelper' @ [106:26] ==> public abstract fun createPullUpHelper(p0: (PullUpData..PullUpData?)): raw (PullUpHelper<(MemberInfoBase<*>..MemberInfoBase<*>?)>..PullUpHelper<out (MemberInfoBase<*>..MemberInfoBase<*>?)>?) defined in com.intellij.refactoring.memberPullUp.PullUpHelperFactory[JavaMethodDescriptor]

'data' @ [106:45] ==> value-parameter data: PullUpData defined in org.jetbrains.kotlin.idea.refactoring.pullUp.JavaToKotlinPullUpHelperFactory.createPullUpHelper[ValueParameterDescriptorImpl]

'EmptyPullUpHelper' @ [107:19] ==> public object EmptyPullUpHelper : PullUpHelper<MemberInfoBase<PsiMember>> defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file EmptyPullUpHelper.kt[FakeCallableDescriptorForObject]

