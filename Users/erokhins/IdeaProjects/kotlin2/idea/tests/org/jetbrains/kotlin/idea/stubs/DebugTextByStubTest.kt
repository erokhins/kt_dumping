'LightCodeInsightFixtureTestCase' @ [42:29] ==> protected/*protected and package*/ constructor LightCodeInsightFixtureTestCase() defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaClassConstructorDescriptor]

'myFixture' @ [44:20] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[JavaPropertyDescriptor]

'configureByText' @ [44:30] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'text' @ [44:57] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.createFileAndStubTree[ValueParameterDescriptorImpl]

'KtFileStubBuilder' @ [45:20] ==> public constructor KtFileStubBuilder() defined in org.jetbrains.kotlin.psi.stubs.elements.KtFileStubBuilder[JavaClassConstructorDescriptor]

'buildStubTree' @ [45:40] ==> public open fun buildStubTree(@NotNull p0: PsiFile): raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtFileStubBuilder[JavaMethodDescriptor]

'file' @ [45:54] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.createFileAndStubTree[LocalVariableDescriptor]

'Pair' @ [46:16] ==> public constructor Pair<out A, out B>(first: KtFile, second: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>)) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> KtFile
    <out B> -> raw (com.intellij.psi.stubs.StubElement<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>..com.intellij.psi.stubs.StubElement<*>)

'file' @ [46:21] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.createFileAndStubTree[LocalVariableDescriptor]

'stub' @ [46:27] ==> val stub: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>) defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.createFileAndStubTree[LocalVariableDescriptor]

'createFileAndStubTree' @ [49:48] ==> private final fun createFileAndStubTree(text: String): Pair<KtFile, StubElement<*>> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'text' @ [49:70] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.createStubTree[ValueParameterDescriptorImpl]

'second' @ [49:76] ==> public final val second: StubElement<*> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'component1' @ [52:14] ==> public final operator fun component1(): KtFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [52:20] ==> public final operator fun component2(): StubElement<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createFileAndStubTree' @ [52:28] ==> private final fun createFileAndStubTree(text: String): Pair<KtFile, StubElement<*>> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'text' @ [52:50] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.packageDirective[ValueParameterDescriptorImpl]

'tree' @ [53:32] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.packageDirective[LocalVariableDescriptor]

'findChildStubByType' @ [53:37] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtPackageDirective..KtPackageDirective?)>): StubElement<(KtPackageDirective..KtPackageDirective?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtPackageDirective..org.jetbrains.kotlin.psi.KtPackageDirective?)

'PACKAGE_DIRECTIVE' @ [53:76] ==> public final val PACKAGE_DIRECTIVE: (KtPlaceHolderStubElementType<(KtPackageDirective..KtPackageDirective?)>..KtPlaceHolderStubElementType<(KtPackageDirective..KtPackageDirective?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'KtPackageDirective' @ [54:19] ==> public constructor KtPackageDirective(@NotNull p0: KotlinPlaceHolderStub<(KtPackageDirective..KtPackageDirective?)>) defined in org.jetbrains.kotlin.psi.KtPackageDirective[JavaClassConstructorDescriptor]

'packageDirective' @ [54:38] ==> val packageDirective: StubElement<(KtPackageDirective..KtPackageDirective?)>? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.packageDirective[LocalVariableDescriptor]

'assertEquals' @ [55:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'file' @ [55:29] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.packageDirective[LocalVariableDescriptor]

'packageDirective' @ [55:34] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'text' @ [55:53] ==> public final val KtPackageDirective.text: (String..String?)[MyPropertyDescriptor]

'psi' @ [55:59] ==> val psi: KtPackageDirective defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.packageDirective[LocalVariableDescriptor]

'getDebugText' @ [55:63] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'component1' @ [59:14] ==> public final operator fun component1(): KtFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [59:20] ==> public final operator fun component2(): StubElement<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createFileAndStubTree' @ [59:28] ==> private final fun createFileAndStubTree(text: String): Pair<KtFile, StubElement<*>> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'text' @ [59:50] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.function[ValueParameterDescriptorImpl]

'tree' @ [60:24] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.function[LocalVariableDescriptor]

'findChildStubByType' @ [60:29] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtNamedFunction..KtNamedFunction?)>): StubElement<(KtNamedFunction..KtNamedFunction?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)

'FUNCTION' @ [60:68] ==> public final val FUNCTION: (KtFunctionElementType..KtFunctionElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'KtNamedFunction' @ [61:19] ==> public constructor KtNamedFunction(@NotNull p0: KotlinFunctionStub) defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaClassConstructorDescriptor]

'function' @ [61:35] ==> val function: StubElement<(KtNamedFunction..KtNamedFunction?)>? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.function[LocalVariableDescriptor]

'assertEquals' @ [62:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'+' @ [62:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'file' @ [62:40] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.function[LocalVariableDescriptor]

'findChildByClass' @ [62:45] ==> @Nullable public open fun <T : (Any..Any?)> findChildByClass(p0: (Class<(KtNamedFunction..KtNamedFunction?)>..Class<(KtNamedFunction..KtNamedFunction?)>?)): KtNamedFunction? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)

'java' @ [62:85] ==> public val <T> KClass<KtNamedFunction>.java: Class<KtNamedFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'text' @ [62:93] ==> public final val KtNamedFunction.text: (String..String?)[MyPropertyDescriptor]

'psi' @ [62:99] ==> val psi: KtNamedFunction defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.function[LocalVariableDescriptor]

'getDebugText' @ [62:103] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'component1' @ [66:14] ==> public final operator fun component1(): KtFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [66:20] ==> public final operator fun component2(): StubElement<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createFileAndStubTree' @ [66:28] ==> private final fun createFileAndStubTree(text: String): Pair<KtFile, StubElement<*>> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'text' @ [66:63] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.typeReference[ValueParameterDescriptorImpl]

'tree' @ [67:24] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.typeReference[LocalVariableDescriptor]

'findChildStubByType' @ [67:29] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtNamedFunction..KtNamedFunction?)>): StubElement<(KtNamedFunction..KtNamedFunction?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)

'FUNCTION' @ [67:68] ==> public final val FUNCTION: (KtFunctionElementType..KtFunctionElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'function' @ [68:29] ==> val function: StubElement<(KtNamedFunction..KtNamedFunction?)> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.typeReference[LocalVariableDescriptor]

'findChildStubByType' @ [68:38] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtParameterList..KtParameterList?)>): StubElement<(KtParameterList..KtParameterList?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtParameterList..org.jetbrains.kotlin.psi.KtParameterList?)

'VALUE_PARAMETER_LIST' @ [68:77] ==> public final val VALUE_PARAMETER_LIST: (KtPlaceHolderStubElementType<(KtParameterList..KtParameterList?)>..KtPlaceHolderStubElementType<(KtParameterList..KtParameterList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'parameterList' @ [69:30] ==> val parameterList: StubElement<(KtParameterList..KtParameterList?)> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.typeReference[LocalVariableDescriptor]

'findChildStubByType' @ [69:44] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtParameter..KtParameter?)>): StubElement<(KtParameter..KtParameter?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'VALUE_PARAMETER' @ [69:83] ==> public final val VALUE_PARAMETER: (KtParameterElementType..KtParameterElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'valueParameter' @ [70:33] ==> val valueParameter: StubElement<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.typeReference[LocalVariableDescriptor]

'findChildStubByType' @ [70:48] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtTypeReference..KtTypeReference?)>): StubElement<(KtTypeReference..KtTypeReference?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)

'TYPE_REFERENCE' @ [70:87] ==> public final val TYPE_REFERENCE: (KtPlaceHolderStubElementType<(KtTypeReference..KtTypeReference?)>..KtPlaceHolderStubElementType<(KtTypeReference..KtTypeReference?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'KtTypeReference' @ [71:27] ==> public constructor KtTypeReference(stub: KotlinPlaceHolderStub<KtTypeReference>) defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedClassConstructorDescriptor]

'typeReferenceStub' @ [71:43] ==> val typeReferenceStub: StubElement<(KtTypeReference..KtTypeReference?)>? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.typeReference[LocalVariableDescriptor]

'file' @ [72:34] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.typeReference[LocalVariableDescriptor]

'findChildByClass' @ [72:39] ==> @Nullable public open fun <T : (Any..Any?)> findChildByClass(p0: (Class<(KtNamedFunction..KtNamedFunction?)>..Class<(KtNamedFunction..KtNamedFunction?)>?)): KtNamedFunction? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtNamedFunction..org.jetbrains.kotlin.psi.KtNamedFunction?)

'java' @ [72:79] ==> public val <T> KClass<KtNamedFunction>.java: Class<KtNamedFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'valueParameters' @ [72:87] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'typeReference' @ [72:106] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'assertEquals' @ [73:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'typeReferenceByPsi' @ [73:29] ==> val typeReferenceByPsi: KtTypeReference? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.typeReference[LocalVariableDescriptor]

'text' @ [73:50] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'psiFromStub' @ [73:56] ==> val psiFromStub: KtTypeReference defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.typeReference[LocalVariableDescriptor]

'getDebugText' @ [73:68] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'component1' @ [77:14] ==> public final operator fun component1(): KtFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [77:20] ==> public final operator fun component2(): StubElement<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createFileAndStubTree' @ [77:28] ==> private final fun createFileAndStubTree(text: String): Pair<KtFile, StubElement<*>> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'text' @ [77:50] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.clazz[ValueParameterDescriptorImpl]

'tree' @ [78:21] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.clazz[LocalVariableDescriptor]

'findChildStubByType' @ [78:26] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtClass..KtClass?)>): StubElement<(KtClass..KtClass?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClass..org.jetbrains.kotlin.psi.KtClass?)

'CLASS' @ [78:65] ==> public final val CLASS: (KtClassElementType..KtClassElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'KtClass' @ [79:27] ==> public constructor KtClass(stub: KotlinClassStub) defined in org.jetbrains.kotlin.psi.KtClass[DeserializedClassConstructorDescriptor]

'clazz' @ [79:35] ==> val clazz: StubElement<(KtClass..KtClass?)> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.clazz[LocalVariableDescriptor]

'file' @ [80:26] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.clazz[LocalVariableDescriptor]

'findChildByClass' @ [80:31] ==> @Nullable public open fun <T : (Any..Any?)> findChildByClass(p0: (Class<(KtClass..KtClass?)>..Class<(KtClass..KtClass?)>?)): KtClass? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtClass..org.jetbrains.kotlin.psi.KtClass?)

'java' @ [80:63] ==> public val <T> KClass<KtClass>.java: Class<KtClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClass

'+' @ [81:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expectedText' @ [81:42] ==> value-parameter expectedText: String? = ... defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.clazz[ValueParameterDescriptorImpl]

'classByPsi' @ [81:58] ==> val classByPsi: KtClass? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.clazz[LocalVariableDescriptor]

'text' @ [81:71] ==> public final val KtClass.text: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [82:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'toCheckAgainst' @ [82:29] ==> val toCheckAgainst: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.clazz[LocalVariableDescriptor]

'psiFromStub' @ [82:45] ==> val psiFromStub: KtClass defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.clazz[LocalVariableDescriptor]

'getDebugText' @ [82:57] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'expectedText' @ [83:13] ==> value-parameter expectedText: String? = ... defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.clazz[ValueParameterDescriptorImpl]

'assertNotEquals' @ [84:20] ==> public open fun assertNotEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'classByPsi' @ [84:77] ==> val classByPsi: KtClass? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.clazz[LocalVariableDescriptor]

'getDebugText' @ [84:90] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'psiFromStub' @ [84:106] ==> val psiFromStub: KtClass defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.clazz[LocalVariableDescriptor]

'getDebugText' @ [84:118] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'component1' @ [89:14] ==> public final operator fun component1(): KtFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [89:20] ==> public final operator fun component2(): StubElement<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createFileAndStubTree' @ [89:28] ==> private final fun createFileAndStubTree(text: String): Pair<KtFile, StubElement<*>> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'text' @ [89:50] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.obj[ValueParameterDescriptorImpl]

'tree' @ [90:19] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.obj[LocalVariableDescriptor]

'findChildStubByType' @ [90:24] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtObjectDeclaration..KtObjectDeclaration?)>): StubElement<(KtObjectDeclaration..KtObjectDeclaration?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtObjectDeclaration..org.jetbrains.kotlin.psi.KtObjectDeclaration?)

'OBJECT_DECLARATION' @ [90:63] ==> public final val OBJECT_DECLARATION: (KtObjectElementType..KtObjectElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'KtObjectDeclaration' @ [91:27] ==> public constructor KtObjectDeclaration(stub: KotlinObjectStub) defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedClassConstructorDescriptor]

'obj' @ [91:47] ==> val obj: StubElement<(KtObjectDeclaration..KtObjectDeclaration?)> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.obj[LocalVariableDescriptor]

'file' @ [92:27] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.obj[LocalVariableDescriptor]

'findChildByClass' @ [92:32] ==> @Nullable public open fun <T : (Any..Any?)> findChildByClass(p0: (Class<(KtObjectDeclaration..KtObjectDeclaration?)>..Class<(KtObjectDeclaration..KtObjectDeclaration?)>?)): KtObjectDeclaration? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtObjectDeclaration..org.jetbrains.kotlin.psi.KtObjectDeclaration?)

'java' @ [92:76] ==> public val <T> KClass<KtObjectDeclaration>.java: Class<KtObjectDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtObjectDeclaration

'+' @ [93:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expectedText' @ [93:42] ==> value-parameter expectedText: String? = ... defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.obj[ValueParameterDescriptorImpl]

'objectByPsi' @ [93:58] ==> val objectByPsi: KtObjectDeclaration? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.obj[LocalVariableDescriptor]

'text' @ [93:72] ==> public final val KtObjectDeclaration.text: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [94:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'toCheckAgainst' @ [94:29] ==> val toCheckAgainst: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.obj[LocalVariableDescriptor]

'psiFromStub' @ [94:45] ==> val psiFromStub: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.obj[LocalVariableDescriptor]

'getDebugText' @ [94:57] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'component1' @ [98:14] ==> public final operator fun component1(): KtFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [98:20] ==> public final operator fun component2(): StubElement<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createFileAndStubTree' @ [98:28] ==> private final fun createFileAndStubTree(text: String): Pair<KtFile, StubElement<*>> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'text' @ [98:50] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.property[ValueParameterDescriptorImpl]

'tree' @ [99:24] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.property[LocalVariableDescriptor]

'findChildStubByType' @ [99:29] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtProperty..KtProperty?)>): StubElement<(KtProperty..KtProperty?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)

'PROPERTY' @ [99:68] ==> public final val PROPERTY: (KtPropertyElementType..KtPropertyElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'KtProperty' @ [100:27] ==> public constructor KtProperty(@NotNull p0: KotlinPropertyStub) defined in org.jetbrains.kotlin.psi.KtProperty[JavaClassConstructorDescriptor]

'property' @ [100:38] ==> val property: StubElement<(KtProperty..KtProperty?)> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.property[LocalVariableDescriptor]

'file' @ [101:29] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.property[LocalVariableDescriptor]

'findChildByClass' @ [101:34] ==> @Nullable public open fun <T : (Any..Any?)> findChildByClass(p0: (Class<(KtProperty..KtProperty?)>..Class<(KtProperty..KtProperty?)>?)): KtProperty? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)

'java' @ [101:69] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'+' @ [102:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expectedText' @ [102:42] ==> value-parameter expectedText: String? = ... defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.property[ValueParameterDescriptorImpl]

'propertyByPsi' @ [102:58] ==> val propertyByPsi: KtProperty? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.property[LocalVariableDescriptor]

'text' @ [102:74] ==> public final val KtProperty.text: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [103:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'toCheckAgainst' @ [103:29] ==> val toCheckAgainst: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.property[LocalVariableDescriptor]

'psiFromStub' @ [103:45] ==> val psiFromStub: KtProperty defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.property[LocalVariableDescriptor]

'getDebugText' @ [103:57] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'component1' @ [107:14] ==> public final operator fun component1(): KtFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [107:20] ==> public final operator fun component2(): StubElement<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createFileAndStubTree' @ [107:28] ==> private final fun createFileAndStubTree(text: String): Pair<KtFile, StubElement<*>> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'text' @ [107:50] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.importList[ValueParameterDescriptorImpl]

'tree' @ [108:26] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.importList[LocalVariableDescriptor]

'findChildStubByType' @ [108:31] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtImportList..KtImportList?)>): StubElement<(KtImportList..KtImportList?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtImportList..org.jetbrains.kotlin.psi.KtImportList?)

'IMPORT_LIST' @ [108:70] ==> public final val IMPORT_LIST: (KtPlaceHolderStubElementType<(KtImportList..KtImportList?)>..KtPlaceHolderStubElementType<(KtImportList..KtImportList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'KtImportList' @ [109:19] ==> public constructor KtImportList(@NotNull p0: KotlinPlaceHolderStub<(KtImportList..KtImportList?)>) defined in org.jetbrains.kotlin.psi.KtImportList[JavaClassConstructorDescriptor]

'importList' @ [109:32] ==> val importList: StubElement<(KtImportList..KtImportList?)>? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.importList[LocalVariableDescriptor]

'assertEquals' @ [110:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'file' @ [110:29] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.importList[LocalVariableDescriptor]

'importList' @ [110:34] ==> public final val KtFile.importList: KtImportList?[MyPropertyDescriptor]

'text' @ [110:47] ==> public final val KtImportList.text: (String..String?)[MyPropertyDescriptor]

'psi' @ [110:53] ==> val psi: KtImportList defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.importList[LocalVariableDescriptor]

'getDebugText' @ [110:57] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'packageDirective' @ [114:9] ==> public final fun packageDirective(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'packageDirective' @ [115:9] ==> public final fun packageDirective(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'packageDirective' @ [116:9] ==> public final fun packageDirective(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'importList' @ [120:9] ==> public final fun importList(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'importList' @ [121:9] ==> public final fun importList(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'importList' @ [122:9] ==> public final fun importList(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'function' @ [126:9] ==> public final fun function(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'function' @ [127:9] ==> public final fun function(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'function' @ [128:9] ==> public final fun function(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'function' @ [129:9] ==> public final fun function(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'function' @ [130:9] ==> public final fun function(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'function' @ [131:9] ==> public final fun function(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'function' @ [132:9] ==> public final fun function(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'function' @ [133:9] ==> public final fun function(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'function' @ [134:9] ==> public final fun function(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'function' @ [135:9] ==> public final fun function(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'function' @ [136:9] ==> public final fun function(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [140:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [141:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [142:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [143:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [144:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [145:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [146:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [147:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [148:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [149:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [150:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [151:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'typeReference' @ [152:9] ==> public final fun typeReference(text: String): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'clazz' @ [156:9] ==> public final fun clazz(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'clazz' @ [157:9] ==> public final fun clazz(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'clazz' @ [158:9] ==> public final fun clazz(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'clazz' @ [159:9] ==> public final fun clazz(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'clazz' @ [160:9] ==> public final fun clazz(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'clazz' @ [161:9] ==> public final fun clazz(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'clazz' @ [162:9] ==> public final fun clazz(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'clazz' @ [163:9] ==> public final fun clazz(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'clazz' @ [164:9] ==> public final fun clazz(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'clazz' @ [165:9] ==> public final fun clazz(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'clazz' @ [166:9] ==> public final fun clazz(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'obj' @ [170:9] ==> public final fun obj(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'obj' @ [171:9] ==> public final fun obj(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'obj' @ [172:9] ==> public final fun obj(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'obj' @ [173:9] ==> public final fun obj(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'obj' @ [174:9] ==> public final fun obj(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'property' @ [178:9] ==> public final fun property(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'property' @ [179:9] ==> public final fun property(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'property' @ [180:9] ==> public final fun property(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'property' @ [181:9] ==> public final fun property(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'property' @ [182:9] ==> public final fun property(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'property' @ [183:9] ==> public final fun property(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'property' @ [184:9] ==> public final fun property(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'property' @ [185:9] ==> public final fun property(text: String, expectedText: String? = ...): Unit defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'createStubTree' @ [189:20] ==> private final fun createStubTree(text: String): StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'tree' @ [190:25] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testClassBody[LocalVariableDescriptor]

'findChildStubByType' @ [190:30] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtClass..KtClass?)>): StubElement<(KtClass..KtClass?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClass..org.jetbrains.kotlin.psi.KtClass?)

'CLASS' @ [190:69] ==> public final val CLASS: (KtClassElementType..KtClassElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'findChildStubByType' @ [190:78] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtClassBody..KtClassBody?)>): StubElement<(KtClassBody..KtClassBody?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClassBody..org.jetbrains.kotlin.psi.KtClassBody?)

'CLASS_BODY' @ [190:117] ==> public final val CLASS_BODY: (KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>..KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'assertEquals' @ [191:9] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'KtClassBody' @ [191:54] ==> public constructor KtClassBody(stub: KotlinPlaceHolderStub<KtClassBody>) defined in org.jetbrains.kotlin.psi.KtClassBody[DeserializedClassConstructorDescriptor]

'classBody' @ [191:66] ==> val classBody: StubElement<(KtClassBody..KtClassBody?)>? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testClassBody[LocalVariableDescriptor]

'getDebugText' @ [191:102] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'createStubTree' @ [195:20] ==> private final fun createStubTree(text: String): StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'tree' @ [196:27] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testClassInitializer[LocalVariableDescriptor]

'findChildStubByType' @ [196:32] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtClass..KtClass?)>): StubElement<(KtClass..KtClass?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClass..org.jetbrains.kotlin.psi.KtClass?)

'CLASS' @ [196:71] ==> public final val CLASS: (KtClassElementType..KtClassElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'findChildStubByType' @ [196:80] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtClassBody..KtClassBody?)>): StubElement<(KtClassBody..KtClassBody?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClassBody..org.jetbrains.kotlin.psi.KtClassBody?)

'CLASS_BODY' @ [196:119] ==> public final val CLASS_BODY: (KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>..KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'findChildStubByType' @ [197:18] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtClassInitializer..KtClassInitializer?)>): StubElement<(KtClassInitializer..KtClassInitializer?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClassInitializer..org.jetbrains.kotlin.psi.KtClassInitializer?)

'CLASS_INITIALIZER' @ [197:57] ==> public final val CLASS_INITIALIZER: (KtPlaceHolderStubElementType<(KtClassInitializer..KtClassInitializer?)>..KtPlaceHolderStubElementType<(KtClassInitializer..KtClassInitializer?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'assertEquals' @ [198:9] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'KtClassInitializer' @ [198:54] ==> public constructor KtClassInitializer(stub: KotlinPlaceHolderStub<KtClassInitializer>) defined in org.jetbrains.kotlin.psi.KtClassInitializer[DeserializedClassConstructorDescriptor]

'initializer' @ [198:73] ==> val initializer: StubElement<(KtClassInitializer..KtClassInitializer?)>? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testClassInitializer[LocalVariableDescriptor]

'getDebugText' @ [198:111] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'createStubTree' @ [202:20] ==> private final fun createStubTree(text: String): StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'tree' @ [203:31] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testClassObject[LocalVariableDescriptor]

'findChildStubByType' @ [203:36] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtClass..KtClass?)>): StubElement<(KtClass..KtClass?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClass..org.jetbrains.kotlin.psi.KtClass?)

'CLASS' @ [203:75] ==> public final val CLASS: (KtClassElementType..KtClassElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'findChildStubByType' @ [203:84] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtClassBody..KtClassBody?)>): StubElement<(KtClassBody..KtClassBody?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClassBody..org.jetbrains.kotlin.psi.KtClassBody?)

'CLASS_BODY' @ [203:123] ==> public final val CLASS_BODY: (KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>..KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'findChildStubByType' @ [204:18] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtObjectDeclaration..KtObjectDeclaration?)>): StubElement<(KtObjectDeclaration..KtObjectDeclaration?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtObjectDeclaration..org.jetbrains.kotlin.psi.KtObjectDeclaration?)

'OBJECT_DECLARATION' @ [204:57] ==> public final val OBJECT_DECLARATION: (KtObjectElementType..KtObjectElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'assertEquals' @ [205:9] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'KtObjectDeclaration' @ [205:52] ==> public constructor KtObjectDeclaration(stub: KotlinObjectStub) defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedClassConstructorDescriptor]

'companionObject' @ [205:72] ==> val companionObject: StubElement<(KtObjectDeclaration..KtObjectDeclaration?)>? defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testClassObject[LocalVariableDescriptor]

'getDebugText' @ [205:109] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'createStubTree' @ [209:20] ==> private final fun createStubTree(text: String): StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'tree' @ [210:28] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testPropertyAccessors[LocalVariableDescriptor]

'findChildStubByType' @ [210:33] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtProperty..KtProperty?)>): StubElement<(KtProperty..KtProperty?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)

'PROPERTY' @ [210:72] ==> public final val PROPERTY: (KtPropertyElementType..KtPropertyElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'propertyStub' @ [211:25] ==> val propertyStub: StubElement<(KtProperty..KtProperty?)> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testPropertyAccessors[LocalVariableDescriptor]

'getChildrenByType' @ [211:38] ==> @NotNull public abstract fun <E : (PsiElement..PsiElement?)> getChildrenByType(@NotNull p0: IElementType, @NotNull p1: ArrayFactory<(KtPropertyAccessor..KtPropertyAccessor?)>): (Array<(KtPropertyAccessor..KtPropertyAccessor?)>..Array<out (KtPropertyAccessor..KtPropertyAccessor?)>) defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtPropertyAccessor..org.jetbrains.kotlin.psi.KtPropertyAccessor?)

'PROPERTY_ACCESSOR' @ [211:75] ==> public final val PROPERTY_ACCESSOR: (KtPropertyAccessorElementType..KtPropertyAccessorElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'PROPERTY_ACCESSOR' @ [211:113] ==> public final val PROPERTY_ACCESSOR: (KtPropertyAccessorElementType..KtPropertyAccessorElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'arrayFactory' @ [211:131] ==> public final val KtPropertyAccessorElementType.arrayFactory: ArrayFactory<(KtPropertyAccessor..KtPropertyAccessor?)>[MyPropertyDescriptor]

'assertEquals' @ [212:9] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'accessors' @ [212:53] ==> val accessors: (Array<(KtPropertyAccessor..KtPropertyAccessor?)>..Array<out (KtPropertyAccessor..KtPropertyAccessor?)>) defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testPropertyAccessors[LocalVariableDescriptor]

'getDebugText' @ [212:66] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [213:9] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'accessors' @ [213:53] ==> val accessors: (Array<(KtPropertyAccessor..KtPropertyAccessor?)>..Array<out (KtPropertyAccessor..KtPropertyAccessor?)>) defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testPropertyAccessors[LocalVariableDescriptor]

'getDebugText' @ [213:66] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'createStubTree' @ [217:20] ==> private final fun createStubTree(text: String): StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest[SimpleFunctionDescriptorImpl]

'tree' @ [218:25] ==> val tree: StubElement<*> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testEnumEntry[LocalVariableDescriptor]

'findChildStubByType' @ [218:30] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtClass..KtClass?)>): StubElement<(KtClass..KtClass?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClass..org.jetbrains.kotlin.psi.KtClass?)

'CLASS' @ [218:69] ==> public final val CLASS: (KtClassElementType..KtClassElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'findChildStubByType' @ [218:78] ==> @Nullable public abstract fun <P : (PsiElement..PsiElement?)> findChildStubByType(@NotNull p0: IStubElementType<*, (KtClassBody..KtClassBody?)>): StubElement<(KtClassBody..KtClassBody?)>? defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <P : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClassBody..org.jetbrains.kotlin.psi.KtClassBody?)

'CLASS_BODY' @ [218:117] ==> public final val CLASS_BODY: (KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>..KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'enumClass' @ [219:23] ==> val enumClass: StubElement<(KtClassBody..KtClassBody?)> defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testEnumEntry[LocalVariableDescriptor]

'getChildrenByType' @ [219:33] ==> @NotNull public abstract fun <E : (PsiElement..PsiElement?)> getChildrenByType(@NotNull p0: IElementType, @NotNull p1: ArrayFactory<(KtClass..KtClass?)>): (Array<(KtClass..KtClass?)>..Array<out (KtClass..KtClass?)>) defined in com.intellij.psi.stubs.StubElement[JavaMethodDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtClass..org.jetbrains.kotlin.psi.KtClass?)

'ENUM_ENTRY' @ [219:70] ==> public final val ENUM_ENTRY: (KtClassElementType..KtClassElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'ENUM_ENTRY' @ [219:101] ==> public final val ENUM_ENTRY: (KtClassElementType..KtClassElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'arrayFactory' @ [219:112] ==> public final val KtClassElementType.arrayFactory: ArrayFactory<(KtClass..KtClass?)>[MyPropertyDescriptor]

'assertEquals' @ [220:9] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'entries' @ [220:45] ==> val entries: (Array<(KtClass..KtClass?)>..Array<out (KtClass..KtClass?)>) defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testEnumEntry[LocalVariableDescriptor]

'getDebugText' @ [220:56] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [221:9] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'entries' @ [221:52] ==> val entries: (Array<(KtClass..KtClass?)>..Array<out (KtClass..KtClass?)>) defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testEnumEntry[LocalVariableDescriptor]

'getDebugText' @ [221:63] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [222:9] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase[JavaMethodDescriptor]

'entries' @ [222:52] ==> val entries: (Array<(KtClass..KtClass?)>..Array<out (KtClass..KtClass?)>) defined in org.jetbrains.kotlin.idea.stubs.DebugTextByStubTest.testEnumEntry[LocalVariableDescriptor]

'getDebugText' @ [222:63] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

