'RenameKotlinPsiProcessor' @ [54:39] ==> public constructor RenameKotlinPsiProcessor() defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor[ClassConstructorDescriptorImpl]

'RenameJavaMethodProcessor' @ [55:47] ==> public constructor RenameJavaMethodProcessor() defined in com.intellij.refactoring.rename.RenameJavaMethodProcessor[JavaClassConstructorDescriptor]

'element' @ [58:16] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.canProcessElement[ValueParameterDescriptorImpl]

'element' @ [58:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.canProcessElement[ValueParameterDescriptorImpl]

'element' @ [58:75] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.canProcessElement[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [58:83] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'element' @ [58:119] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.canProcessElement[ValueParameterDescriptorImpl]

'getInstance' @ [61:89] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'RENAME_SEARCH_IN_COMMENTS_FOR_METHOD' @ [61:103] ==> public final var RENAME_SEARCH_IN_COMMENTS_FOR_METHOD: Boolean defined in com.intellij.refactoring.JavaRefactoringSettings[JavaPropertyDescriptor]

'getInstance' @ [64:33] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'RENAME_SEARCH_IN_COMMENTS_FOR_METHOD' @ [64:47] ==> public final var RENAME_SEARCH_IN_COMMENTS_FOR_METHOD: Boolean defined in com.intellij.refactoring.JavaRefactoringSettings[JavaPropertyDescriptor]

'enabled' @ [64:86] ==> value-parameter enabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.setToSearchInComments[ValueParameterDescriptorImpl]

'getInstance' @ [67:94] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'RENAME_SEARCH_FOR_TEXT_FOR_METHOD' @ [67:108] ==> public final var RENAME_SEARCH_FOR_TEXT_FOR_METHOD: Boolean defined in com.intellij.refactoring.JavaRefactoringSettings[JavaPropertyDescriptor]

'getInstance' @ [70:33] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'RENAME_SEARCH_FOR_TEXT_FOR_METHOD' @ [70:47] ==> public final var RENAME_SEARCH_FOR_TEXT_FOR_METHOD: Boolean defined in com.intellij.refactoring.JavaRefactoringSettings[JavaPropertyDescriptor]

'enabled' @ [70:83] ==> value-parameter enabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.setToSearchForTextOccurrences[ValueParameterDescriptorImpl]

'?:' @ [74:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: FunctionDescriptor?, right: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> FunctionDescriptor

'element' @ [74:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.getJvmName[ValueParameterDescriptorImpl]

'unwrapped' @ [74:35] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'resolveToDescriptor' @ [74:62] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getJvmName' @ [75:32] ==> @Nullable public open fun getJvmName(@NotNull p0: Annotated): String? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [75:43] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.getJvmName[LocalVariableDescriptor]

'super' @ [79:29] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[LazyClassReceiverParameterDescriptor]

'findReferences' @ [79:35] ==> public open fun findReferences(element: PsiElement): Collection<PsiReference> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor[SimpleFunctionDescriptorImpl]

'element' @ [79:50] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findReferences[ValueParameterDescriptorImpl]

'when {
            getJvmName(element) == null -> allReferences
            element is KtElement -> allReferences.filter { it is KtReference }
            element is KtLightElement<*, *> -> allReferences.filterNot { it is KtReference }
            else -> emptyList()
        }' @ [80:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<PsiReference>, entry1: Collection<PsiReference>, entry2: Collection<PsiReference>, entry3: Collection<PsiReference>): Collection<PsiReference>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<PsiReference>

'getJvmName' @ [81:13] ==> private final fun getJvmName(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[SimpleFunctionDescriptorImpl]

'element' @ [81:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findReferences[ValueParameterDescriptorImpl]

'allReferences' @ [81:44] ==> val allReferences: Collection<PsiReference> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findReferences[LocalVariableDescriptor]

'element' @ [82:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findReferences[ValueParameterDescriptorImpl]

'allReferences' @ [82:37] ==> val allReferences: Collection<PsiReference> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findReferences[LocalVariableDescriptor]

'filter' @ [82:51] ==> public inline fun <T> Iterable<PsiReference>.filter(predicate: (PsiReference) -> Boolean): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'it' @ [82:60] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findReferences.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [83:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findReferences[ValueParameterDescriptorImpl]

'allReferences' @ [83:48] ==> val allReferences: Collection<PsiReference> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findReferences[LocalVariableDescriptor]

'filterNot' @ [83:62] ==> public inline fun <T> Iterable<PsiReference>.filterNot(predicate: (PsiReference) -> Boolean): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'it' @ [83:74] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findReferences.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [84:21] ==> public fun <T> emptyList(): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'newName' @ [94:13] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findCollisions[ValueParameterDescriptorImpl]

'element' @ [95:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findCollisions[ValueParameterDescriptorImpl]

'unwrapped' @ [95:35] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'declaration' @ [96:26] ==> val declaration: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findCollisions[LocalVariableDescriptor]

'resolveToDescriptor' @ [96:38] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'checkConflictsAndReplaceUsageInfos' @ [97:9] ==> public fun checkConflictsAndReplaceUsageInfos(element: PsiElement, allRenames: Map<out PsiElement?, String>, result: MutableList<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename[SimpleFunctionDescriptorImpl]

'element' @ [97:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findCollisions[ValueParameterDescriptorImpl]

'allRenames' @ [97:53] ==> value-parameter allRenames: Map<out PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findCollisions[ValueParameterDescriptorImpl]

'result' @ [97:65] ==> value-parameter result: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findCollisions[ValueParameterDescriptorImpl]

'checkRedeclarations' @ [98:9] ==> internal fun checkRedeclarations(descriptor: DeclarationDescriptor, newName: String, result: MutableList<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename[SimpleFunctionDescriptorImpl]

'descriptor' @ [98:29] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findCollisions[LocalVariableDescriptor]

'newName' @ [98:41] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findCollisions[ValueParameterDescriptorImpl]

'result' @ [98:50] ==> value-parameter result: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.findCollisions[ValueParameterDescriptorImpl]

'originalDeclaration' @ [104:78] ==> value-parameter originalDeclaration: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.FunctionWithSupersWrapper.<init>[ValueParameterDescriptorImpl]

'originalDeclaration' @ [106:21] ==> public final val originalDeclaration: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.FunctionWithSupersWrapper[PropertyDescriptorImpl]

'originalDeclaration' @ [108:21] ==> public final val originalDeclaration: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.FunctionWithSupersWrapper[PropertyDescriptorImpl]

'element' @ [111:68] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteForHeaderOrImpl[ValueParameterDescriptorImpl]

'namedUnwrappedElement' @ [111:77] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'liftToHeader' @ [111:124] ==> internal fun KtDeclaration.liftToHeader(): KtDeclaration? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'substituteForHeaderOrImpl' @ [114:9] ==> private final fun substituteForHeaderOrImpl(element: PsiElement?): KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[SimpleFunctionDescriptorImpl]

'element' @ [114:35] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'let' @ [114:45] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> Nothing

'it' @ [114:58] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename.<anonymous>[ValueParameterDescriptorImpl]

'wrapPsiMethod' @ [116:29] ==> private final fun wrapPsiMethod(element: PsiElement?): PsiMethod? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[SimpleFunctionDescriptorImpl]

'element' @ [116:43] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'element' @ [116:62] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'wrappedMethod' @ [118:35] ==> val wrappedMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'findDeepestSuperMethods' @ [118:49] ==> @NotNull public abstract fun findDeepestSuperMethods(): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'when {
            deepestSuperMethods.isEmpty() -> return element
            wrappedMethod.isConstructor || deepestSuperMethods.size == 1 || element !is KtNamedFunction -> {
                javaMethodProcessorInstance.substituteElementToRename(wrappedMethod, editor)
            }
            else -> {
                val chosenElements = checkSuperMethods(element, null, "rename")
                if (chosenElements.size > 1) FunctionWithSupersWrapper(element, chosenElements) else wrappedMethod
            }
        }' @ [119:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'deepestSuperMethods' @ [120:13] ==> val deepestSuperMethods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'isEmpty' @ [120:33] ==> @InlineOnly public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'element' @ [120:53] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'wrappedMethod' @ [121:13] ==> val wrappedMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'isConstructor' @ [121:27] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'deepestSuperMethods' @ [121:44] ==> val deepestSuperMethods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'size' @ [121:64] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'element' @ [121:77] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'javaMethodProcessorInstance' @ [122:17] ==> private final val javaMethodProcessorInstance: RenameJavaMethodProcessor defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[PropertyDescriptorImpl]

'substituteElementToRename' @ [122:45] ==> @Nullable public open fun substituteElementToRename(p0: (PsiElement..PsiElement?), p1: Editor?): PsiElement? defined in com.intellij.refactoring.rename.RenameJavaMethodProcessor[JavaMethodDescriptor]

'wrappedMethod' @ [122:71] ==> val wrappedMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'editor' @ [122:86] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'checkSuperMethods' @ [125:38] ==> public fun checkSuperMethods(declaration: KtDeclaration, ignore: Collection<PsiElement>?, actionString: String): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'element' @ [125:56] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'if (chosenElements.size > 1) FunctionWithSupersWrapper(element, chosenElements) else wrappedMethod' @ [126:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiNamedElement, elseBranch: PsiNamedElement): PsiNamedElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiNamedElement

'chosenElements' @ [126:21] ==> val chosenElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'size' @ [126:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'FunctionWithSupersWrapper' @ [126:46] ==> public constructor FunctionWithSupersWrapper(originalDeclaration: KtNamedFunction, supers: List<PsiElement>) defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.FunctionWithSupersWrapper[ClassConstructorDescriptorImpl]

'element' @ [126:72] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'chosenElements' @ [126:81] ==> val chosenElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'wrappedMethod' @ [126:102] ==> val wrappedMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'substitutedJavaElement' @ [130:13] ==> val substitutedJavaElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'element' @ [130:56] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'substitutedJavaElement' @ [131:20] ==> val substitutedJavaElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'kotlinOrigin' @ [131:43] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'substitutedJavaElement' @ [134:16] ==> val substitutedJavaElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'if (substitutedJavaElement is KtLightMethod && element is KtDeclaration) {
                substitutedJavaElement.kotlinOrigin as? KtNamedFunction
            }
            else {
                substitutedJavaElement
            }' @ [139:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'substitutedJavaElement' @ [139:40] ==> value-parameter substitutedJavaElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename.preprocessAndPass[ValueParameterDescriptorImpl]

'element' @ [139:83] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'substitutedJavaElement' @ [140:17] ==> value-parameter substitutedJavaElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename.preprocessAndPass[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [140:40] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'substitutedJavaElement' @ [143:17] ==> value-parameter substitutedJavaElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename.preprocessAndPass[ValueParameterDescriptorImpl]

'renameCallback' @ [145:13] ==> value-parameter renameCallback: Pass<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'pass' @ [145:28] ==> public abstract fun pass(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.openapi.util.Pass[JavaMethodDescriptor]

'elementToProcess' @ [145:33] ==> val elementToProcess: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename.preprocessAndPass[LocalVariableDescriptor]

'substituteForHeaderOrImpl' @ [148:9] ==> private final fun substituteForHeaderOrImpl(element: PsiElement?): KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[SimpleFunctionDescriptorImpl]

'element' @ [148:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'let' @ [148:45] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> Nothing

'preprocessAndPass' @ [148:58] ==> local final fun preprocessAndPass(substitutedJavaElement: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[SimpleFunctionDescriptorImpl]

'it' @ [148:76] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename.<anonymous>[ValueParameterDescriptorImpl]

'wrapPsiMethod' @ [150:29] ==> private final fun wrapPsiMethod(element: PsiElement?): PsiMethod? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[SimpleFunctionDescriptorImpl]

'element' @ [150:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'wrappedMethod' @ [152:35] ==> val wrappedMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'findDeepestSuperMethods' @ [152:49] ==> @NotNull public abstract fun findDeepestSuperMethods(): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'when {
            deepestSuperMethods.isEmpty() -> preprocessAndPass(element)
            wrappedMethod.isConstructor || element !is KtNamedFunction -> {
                javaMethodProcessorInstance.substituteElementToRename(wrappedMethod, editor, Pass(::preprocessAndPass))
            }
            else -> {
                val declaration = element.unwrapped as? KtNamedDeclaration ?: return
                checkSuperMethodsWithPopup(declaration, deepestSuperMethods.toList(), "Rename", editor) {
                    preprocessAndPass(if (it.size > 1) FunctionWithSupersWrapper(element, it) else wrappedMethod)
                }
            }
        }' @ [153:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'deepestSuperMethods' @ [154:13] ==> val deepestSuperMethods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'isEmpty' @ [154:33] ==> @InlineOnly public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'preprocessAndPass' @ [154:46] ==> local final fun preprocessAndPass(substitutedJavaElement: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[SimpleFunctionDescriptorImpl]

'element' @ [154:64] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'wrappedMethod' @ [155:13] ==> val wrappedMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'isConstructor' @ [155:27] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'element' @ [155:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'javaMethodProcessorInstance' @ [156:17] ==> private final val javaMethodProcessorInstance: RenameJavaMethodProcessor defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[PropertyDescriptorImpl]

'substituteElementToRename' @ [156:45] ==> public open fun substituteElementToRename(@NotNull p0: PsiElement, @NotNull p1: Editor, @NotNull p2: Pass<(PsiElement..PsiElement?)>): Unit defined in com.intellij.refactoring.rename.RenameJavaMethodProcessor[JavaMethodDescriptor]

'wrappedMethod' @ [156:71] ==> val wrappedMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'editor' @ [156:86] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'Pass' @ [156:94] ==> public fun <T> Pass(body: ((PsiElement..PsiElement?)) -> Unit): Pass<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'element' @ [159:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'unwrapped' @ [159:43] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'checkSuperMethodsWithPopup' @ [160:17] ==> public fun checkSuperMethodsWithPopup(declaration: KtNamedDeclaration, deepestSuperMethods: List<PsiMethod>, actionString: String, editor: Editor, action: (List<PsiElement>) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'declaration' @ [160:44] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'deepestSuperMethods' @ [160:57] ==> val deepestSuperMethods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'toList' @ [160:77] ==> public fun <T> Array<out (PsiMethod..PsiMethod?)>.toList(): List<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'editor' @ [160:97] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'preprocessAndPass' @ [161:21] ==> local final fun preprocessAndPass(substitutedJavaElement: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[SimpleFunctionDescriptorImpl]

'if (it.size > 1) FunctionWithSupersWrapper(element, it) else wrappedMethod' @ [161:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiNamedElement, elseBranch: PsiNamedElement): PsiNamedElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiNamedElement

'it' @ [161:43] ==> value-parameter it: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [161:46] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'FunctionWithSupersWrapper' @ [161:56] ==> public constructor FunctionWithSupersWrapper(originalDeclaration: KtNamedFunction, supers: List<PsiElement>) defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.FunctionWithSupersWrapper[ClassConstructorDescriptorImpl]

'element' @ [161:82] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[ValueParameterDescriptorImpl]

'it' @ [161:91] ==> value-parameter it: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename.<anonymous>[ValueParameterDescriptorImpl]

'wrappedMethod' @ [161:100] ==> val wrappedMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.substituteElementToRename[LocalVariableDescriptor]

'?:' @ [168:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'element' @ [168:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.createRenameDialog[ValueParameterDescriptorImpl]

'originalDeclaration' @ [168:73] ==> public final val originalDeclaration: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.FunctionWithSupersWrapper[PropertyDescriptorImpl]

'element' @ [168:96] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.createRenameDialog[ValueParameterDescriptorImpl]

'RenameDialog' @ [169:25] ==> public constructor RenameDialog(@NotNull p0: Project, @NotNull p1: PsiElement, @Nullable p2: PsiElement?, p3: (Editor..Editor?)) defined in com.intellij.refactoring.rename.RenameDialog[JavaClassConstructorDescriptor]

'project' @ [169:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.createRenameDialog[ValueParameterDescriptorImpl]

'elementForDialog' @ [169:47] ==> val elementForDialog: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.createRenameDialog[LocalVariableDescriptor]

'nameSuggestionContext' @ [169:65] ==> value-parameter nameSuggestionContext: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.createRenameDialog[ValueParameterDescriptorImpl]

'editor' @ [169:88] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.createRenameDialog[ValueParameterDescriptorImpl]

'RenameProcessor' @ [170:67] ==> public constructor RenameProcessor(p0: (Project..Project?), @NotNull p1: PsiElement, @NotNull @NonNls p2: String, p3: Boolean, p4: Boolean) defined in com.intellij.refactoring.rename.RenameProcessor[JavaClassConstructorDescriptor]

'getProject' @ [170:83] ==> protected/*protected and package*/ open fun getProject(): (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.createRenameDialog.<no name provided>[JavaMethodDescriptor]

'element' @ [170:97] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.createRenameDialog[ValueParameterDescriptorImpl]

'newName' @ [170:106] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.createRenameDialog.<no name provided>.createRenameProcessor[ValueParameterDescriptorImpl]

'isSearchInComments' @ [170:115] ==> public final val <no name provided>.isSearchInComments: Boolean[MyPropertyDescriptor]

'isSearchInNonJavaFiles' @ [170:135] ==> public final val <no name provided>.isSearchInNonJavaFiles: Boolean[MyPropertyDescriptor]

'super' @ [175:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[LazyClassReceiverParameterDescriptor]

'prepareRenaming' @ [175:15] ==> public open fun prepareRenaming(element: PsiElement, newName: String?, allRenames: MutableMap<PsiElement, String>, scope: SearchScope): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor[SimpleFunctionDescriptorImpl]

'element' @ [175:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'newName' @ [175:40] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'allRenames' @ [175:49] ==> value-parameter allRenames: MutableMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'scope' @ [175:61] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'newName' @ [177:13] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'element' @ [179:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'getJvmName' @ [179:41] ==> private final fun getJvmName(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[SimpleFunctionDescriptorImpl]

'element' @ [179:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'element' @ [180:14] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [180:22] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'let' @ [180:57] ==> @InlineOnly public inline fun <T, R> KtNamedFunction.let(block: (KtNamedFunction) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedFunction
    <R> -> Unit

'allRenames' @ [180:63] ==> value-parameter allRenames: MutableMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'it' @ [180:74] ==> value-parameter it: KtNamedFunction defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming.<anonymous>[ValueParameterDescriptorImpl]

'newName' @ [180:80] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'element' @ [182:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'allRenames' @ [183:13] ==> value-parameter allRenames: MutableMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'remove' @ [183:24] ==> public abstract fun remove(key: PsiElement): String? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'element' @ [183:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'iterator' @ [185:29] ==> public abstract fun iterator(): Iterator<PsiElement> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'?:' @ [185:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<PsiElement>?, right: List<PsiElement>): List<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<PsiElement>

'element' @ [185:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'supers' @ [185:71] ==> public final val supers: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.FunctionWithSupersWrapper[PropertyDescriptorImpl]

'listOf' @ [185:81] ==> public fun <T> listOf(element: PsiElement): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'element' @ [185:88] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'wrapPsiMethod' @ [186:29] ==> private final fun wrapPsiMethod(element: PsiElement?): PsiMethod? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[SimpleFunctionDescriptorImpl]

'declaration' @ [186:43] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[LocalVariableDescriptor]

'allRenames' @ [187:13] ==> value-parameter allRenames: MutableMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'declaration' @ [187:24] ==> val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[LocalVariableDescriptor]

'newName' @ [187:39] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'psiMethod' @ [188:17] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[LocalVariableDescriptor]

'containingClass' @ [188:27] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'javaMethodProcessorInstance' @ [189:17] ==> private final val javaMethodProcessorInstance: RenameJavaMethodProcessor defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[PropertyDescriptorImpl]

'prepareRenaming' @ [189:45] ==> public open fun prepareRenaming(p0: (PsiElement..PsiElement?), p1: (String..String?), p2: (MutableMap<(PsiElement..PsiElement?), (String..String?)>..Map<(PsiElement..PsiElement?), (String..String?)>?), p3: (SearchScope..SearchScope?)): Unit defined in com.intellij.refactoring.rename.RenameJavaMethodProcessor[JavaMethodDescriptor]

'psiMethod' @ [189:61] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[LocalVariableDescriptor]

'newName' @ [189:72] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'allRenames' @ [189:81] ==> value-parameter allRenames: MutableMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'scope' @ [189:93] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'ArrayList' @ [195:28] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'usages' @ [195:49] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[ValueParameterDescriptorImpl]

'size' @ [195:56] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'SmartList' @ [196:37] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'usages' @ [197:23] ==> value-parameter usages: Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[ValueParameterDescriptorImpl]

'usage' @ [198:17] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[LocalVariableDescriptor]

'usage' @ [199:17] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[LocalVariableDescriptor]

'apply' @ [199:23] ==> public final fun apply(): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename.LostDefaultValuesInOverridingFunctionUsageInfo[SimpleFunctionDescriptorImpl]

'if (usage.isAmbiguousImportUsage()) {
                ambiguousImportUsages += usage
            }
            else {
                simpleUsages += usage
            }' @ [203:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'usage' @ [203:17] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[LocalVariableDescriptor]

'isAmbiguousImportUsage' @ [203:23] ==> protected final fun UsageInfo.isAmbiguousImportUsage(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[SimpleFunctionDescriptorImpl]

'ambiguousImportUsages' @ [204:17] ==> val ambiguousImportUsages: SmartList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[LocalVariableDescriptor]

'usage' @ [204:42] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[LocalVariableDescriptor]

'simpleUsages' @ [207:17] ==> val simpleUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[LocalVariableDescriptor]

'usage' @ [207:33] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[LocalVariableDescriptor]

'element' @ [210:9] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[ValueParameterDescriptorImpl]

'ambiguousImportUsages' @ [210:17] ==> protected final var PsiElement.ambiguousImportUsages: List<UsageInfo>? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor[PropertyDescriptorImpl]

'ambiguousImportUsages' @ [210:41] ==> val ambiguousImportUsages: SmartList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[LocalVariableDescriptor]

'doRenameGenericNamedElement' @ [212:20] ==> public open fun doRenameGenericNamedElement(@NotNull p0: PsiElement, p1: (String..String?), p2: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?), @Nullable p3: RefactoringElementListener?): Unit defined in com.intellij.refactoring.rename.RenameUtil[JavaMethodDescriptor]

'element' @ [212:48] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[ValueParameterDescriptorImpl]

'newName' @ [212:57] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[ValueParameterDescriptorImpl]

'simpleUsages' @ [212:66] ==> val simpleUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[LocalVariableDescriptor]

'toTypedArray' @ [212:79] ==> public inline fun <reified T> Collection<UsageInfo>.toTypedArray(): Array<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo

'listener' @ [212:95] ==> value-parameter listener: RefactoringElementListener? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[ValueParameterDescriptorImpl]

'element' @ [214:10] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.renameElement[ValueParameterDescriptorImpl]

'unwrapped' @ [214:18] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'let' @ [214:53] ==> @InlineOnly public inline fun <T, R> KtNamedDeclaration.let(block: (KtNamedDeclaration) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> Unit

'when (element) {
        is PsiMethod -> element
        is KtNamedFunction, is KtSecondaryConstructor -> runReadAction {
            LightClassUtil.getLightClassMethod(element as KtFunction)
        }
        else -> throw IllegalStateException("Can't be for element $element there because of canProcessElement()")
    }' @ [217:67] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiMethod?, entry1: PsiMethod?, entry2: PsiMethod?): PsiMethod?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiMethod?

'element' @ [217:73] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.wrapPsiMethod[ValueParameterDescriptorImpl]

'element' @ [218:25] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.wrapPsiMethod[ValueParameterDescriptorImpl]

'runReadAction' @ [219:58] ==> public fun <T> runReadAction(action: () -> PsiMethod?): PsiMethod? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod?

'LightClassUtil' @ [220:13] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassMethod' @ [220:28] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [220:48] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.wrapPsiMethod[ValueParameterDescriptorImpl]

'IllegalStateException' @ [222:23] ==> public constructor IllegalStateException(p0: (String..String?)) defined in java.lang.IllegalStateException[JavaClassConstructorDescriptor]

'element' @ [222:68] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFunctionProcessor.wrapPsiMethod[ValueParameterDescriptorImpl]

