'this' @ [37:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[ReceiverParameterDescriptorImpl]

'isObjectLiteral' @ [37:40] ==> public final fun isObjectLiteral(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'this' @ [39:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[ReceiverParameterDescriptorImpl]

'parent' @ [40:29] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parameterList' @ [41:27] ==> val parameterList: KtParameterList defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[LocalVariableDescriptor]

'parent' @ [41:41] ==> public final val KtParameterList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'declaration' @ [42:16] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[LocalVariableDescriptor]

'this' @ [45:12] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[ReceiverParameterDescriptorImpl]

'this' @ [46:12] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[ReceiverParameterDescriptorImpl]

'this' @ [47:12] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[ReceiverParameterDescriptorImpl]

'this' @ [48:12] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[ReceiverParameterDescriptorImpl]

'this' @ [49:12] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[ReceiverParameterDescriptorImpl]

'this' @ [50:12] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[ReceiverParameterDescriptorImpl]

'this' @ [51:12] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[ReceiverParameterDescriptorImpl]

'this' @ [52:12] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.canDeleteElement[ReceiverParameterDescriptorImpl]

'when (this) {
        is KtNamedFunction, is KtProperty -> {
            (this as KtModifierListOwner).modifierList?.getModifier(KtTokens.OVERRIDE_KEYWORD)?.delete()
        }
        is PsiMethod -> {
            modifierList.annotations.firstOrNull {
                annotation -> annotation.qualifiedName == "java.lang.Override"
            }?.delete()
        }
    }' @ [56:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'this' @ [56:11] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.removeOverrideModifier[ReceiverParameterDescriptorImpl]

'this' @ [58:14] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.removeOverrideModifier[ReceiverParameterDescriptorImpl]

'modifierList' @ [58:43] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [58:57] ==> @Nullable public open fun getModifier(@NotNull p0: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [58:78] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'delete' @ [58:97] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'modifierList' @ [61:13] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'annotations' @ [61:26] ==> public final val PsiModifierList.annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>)[MyPropertyDescriptor]

'firstOrNull' @ [61:38] ==> public inline fun <T> Array<out (PsiAnnotation..PsiAnnotation?)>.firstOrNull(predicate: ((PsiAnnotation..PsiAnnotation?)) -> Boolean): PsiAnnotation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)

'annotation' @ [62:31] ==> value-parameter annotation: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.removeOverrideModifier.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [62:42] ==> public final val PsiAnnotation.qualifiedName: String?[MyPropertyDescriptor]

'delete' @ [63:16] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiAnnotation[JavaMethodDescriptor]

'findSuperMethods' @ [69:24] ==> @NotNull public abstract fun findSuperMethods(p0: Boolean): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'iterator' @ [70:30] ==> public abstract fun iterator(): MutableIterator<(PsiMethod..PsiMethod?)> defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'search' @ [70:54] ==> @NotNull public open fun search(@NotNull p0: PsiMethod, p1: Boolean): Query<(PsiMethod..PsiMethod?)> defined in com.intellij.psi.search.searches.OverridingMethodsSearch[JavaMethodDescriptor]

'this' @ [70:61] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.cleanUpOverrides[ReceiverParameterDescriptorImpl]

'findAll' @ [70:73] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiMethod..PsiMethod?)>..Collection<(PsiMethod..PsiMethod?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

'overridingMethod' @ [71:35] ==> val overridingMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.cleanUpOverrides[LocalVariableDescriptor]

'findSuperMethods' @ [71:52] ==> @NotNull public abstract fun findSuperMethods(p0: Boolean): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'asSequence' @ [71:75] ==> public fun <T> Array<out (PsiMethod..PsiMethod?)>.asSequence(): Sequence<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'superMethods' @ [71:90] ==> val superMethods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.cleanUpOverrides[LocalVariableDescriptor]

'asSequence' @ [71:103] ==> public fun <T> Array<out (PsiMethod..PsiMethod?)>.asSequence(): Sequence<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'currentSuperMethods' @ [72:13] ==> val currentSuperMethods: Sequence<(PsiMethod..PsiMethod?)> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.cleanUpOverrides[LocalVariableDescriptor]

'all' @ [72:33] ==> public inline fun <T> Sequence<(PsiMethod..PsiMethod?)>.all(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'superMethod' @ [72:54] ==> value-parameter superMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.cleanUpOverrides.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [72:66] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'unwrapped' @ [72:79] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'overridingMethod' @ [73:13] ==> val overridingMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.cleanUpOverrides[LocalVariableDescriptor]

'unwrapped' @ [73:30] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'removeOverrideModifier' @ [73:41] ==> public fun PsiElement.removeOverrideModifier(): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'parameter' @ [79:18] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.checkParametersInMethodHierarchy[ValueParameterDescriptorImpl]

'declarationScope' @ [79:28] ==> public final val PsiParameter.declarationScope: PsiElement[MyPropertyDescriptor]

'collectParametersHierarchy' @ [81:30] ==> private fun collectParametersHierarchy(method: PsiMethod, parameter: PsiParameter): Set<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'method' @ [81:57] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.checkParametersInMethodHierarchy[LocalVariableDescriptor]

'parameter' @ [81:65] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.checkParametersInMethodHierarchy[ValueParameterDescriptorImpl]

'parametersToDelete' @ [82:9] ==> val parametersToDelete: Set<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.checkParametersInMethodHierarchy[LocalVariableDescriptor]

'size' @ [82:28] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'getApplication' @ [82:60] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [82:77] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'parametersToDelete' @ [82:100] ==> val parametersToDelete: Set<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.checkParametersInMethodHierarchy[LocalVariableDescriptor]

'message' @ [84:32] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'formatJavaOrLightMethod' @ [84:76] ==> public fun formatJavaOrLightMethod(method: PsiMethod): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'method' @ [84:100] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.checkParametersInMethodHierarchy[LocalVariableDescriptor]

'showOkCancelDialog' @ [85:29] ==> @Messages.OkCancelResult public open fun showOkCancelDialog(p0: (Project..Project?), p1: (String..String?), @Nls p2: (String..String?), p3: (Icon..Icon?)): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'parameter' @ [85:48] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.checkParametersInMethodHierarchy[ValueParameterDescriptorImpl]

'project' @ [85:58] ==> public final val PsiParameter.project: Project[MyPropertyDescriptor]

'message' @ [85:67] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.checkParametersInMethodHierarchy[LocalVariableDescriptor]

'message' @ [85:86] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.ide.IdeBundle[JavaMethodDescriptor]

'getQuestionIcon' @ [85:121] ==> @NotNull public open fun getQuestionIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'if (exitCode == Messages.OK) parametersToDelete else null' @ [86:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<PsiElement>?, elseBranch: Collection<PsiElement>?): Collection<PsiElement>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<PsiElement>?

'exitCode' @ [86:16] ==> val exitCode: Int defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.checkParametersInMethodHierarchy[LocalVariableDescriptor]

'OK' @ [86:37] ==> public const final val OK: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'parametersToDelete' @ [86:41] ==> val parametersToDelete: Set<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.checkParametersInMethodHierarchy[LocalVariableDescriptor]

'ArrayDeque' @ [91:17] ==> public constructor ArrayDeque<E : (Any..Any?)>() defined in java.util.ArrayDeque[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiMethod

'HashSet' @ [92:19] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiMethod

'HashSet' @ [93:30] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'queue' @ [95:5] ==> val queue: ArrayDeque<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'add' @ [95:11] ==> public open fun add(element: (PsiMethod..PsiMethod?)): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'method' @ [95:15] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[ValueParameterDescriptorImpl]

'!' @ [96:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'queue' @ [96:13] ==> val queue: ArrayDeque<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'isEmpty' @ [96:19] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'queue' @ [97:29] ==> val queue: ArrayDeque<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'poll' @ [97:35] ==> public open fun poll(): (PsiMethod..PsiMethod?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'visited' @ [99:9] ==> val visited: HashSet<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'currentMethod' @ [99:20] ==> val currentMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'addParameter' @ [100:9] ==> private fun addParameter(method: PsiMethod, result: MutableSet<PsiElement>, parameter: PsiParameter): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'currentMethod' @ [100:22] ==> val currentMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'parametersToDelete' @ [100:37] ==> val parametersToDelete: HashSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'parameter' @ [100:57] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[ValueParameterDescriptorImpl]

'currentMethod' @ [102:9] ==> val currentMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'findSuperMethods' @ [102:23] ==> @NotNull public abstract fun findSuperMethods(p0: Boolean): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'filter' @ [103:18] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.filter(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): List<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [103:27] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy.<anonymous>[ValueParameterDescriptorImpl]

'visited' @ [103:34] ==> val visited: HashSet<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'forEach' @ [104:18] ==> @HidesMembers public inline fun <T> Iterable<(PsiMethod..PsiMethod?)>.forEach(action: ((PsiMethod..PsiMethod?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'queue' @ [104:28] ==> val queue: ArrayDeque<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'offer' @ [104:34] ==> public open fun offer(p0: (PsiMethod..PsiMethod?)): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'it' @ [104:40] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy.<anonymous>[ValueParameterDescriptorImpl]

'search' @ [105:33] ==> @NotNull public open fun search(@NotNull p0: PsiMethod): Query<(PsiMethod..PsiMethod?)> defined in com.intellij.psi.search.searches.OverridingMethodsSearch[JavaMethodDescriptor]

'currentMethod' @ [105:40] ==> val currentMethod: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'filter' @ [106:18] ==> public inline fun <T> Iterable<(PsiMethod..PsiMethod?)>.filter(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): List<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [106:27] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy.<anonymous>[ValueParameterDescriptorImpl]

'visited' @ [106:34] ==> val visited: HashSet<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'forEach' @ [107:18] ==> @HidesMembers public inline fun <T> Iterable<(PsiMethod..PsiMethod?)>.forEach(action: ((PsiMethod..PsiMethod?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'queue' @ [107:28] ==> val queue: ArrayDeque<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'offer' @ [107:34] ==> public open fun offer(p0: (PsiMethod..PsiMethod?)): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'it' @ [107:40] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy.<anonymous>[ValueParameterDescriptorImpl]

'parametersToDelete' @ [109:12] ==> val parametersToDelete: HashSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.collectParametersHierarchy[LocalVariableDescriptor]

'parameter' @ [113:26] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.addParameter[ValueParameterDescriptorImpl]

'unwrapped' @ [113:36] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'parameterIndex' @ [113:48] ==> public fun PsiElement.parameterIndex(): Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (method is KtLightMethod) {
        val declaration = method.kotlinOrigin
        if (declaration is KtFunction) {
            result.add(declaration.valueParameters[parameterIndex])
        }
    }
    else {
        result.add(method.parameterList.parameters[parameterIndex])
    }' @ [115:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'method' @ [115:9] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.addParameter[ValueParameterDescriptorImpl]

'method' @ [116:27] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.addParameter[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [116:34] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'declaration' @ [117:13] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.addParameter[LocalVariableDescriptor]

'result' @ [118:13] ==> value-parameter result: MutableSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.addParameter[ValueParameterDescriptorImpl]

'add' @ [118:20] ==> public abstract fun add(element: PsiElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'declaration' @ [118:24] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.addParameter[LocalVariableDescriptor]

'valueParameters' @ [118:36] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'parameterIndex' @ [118:52] ==> val parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.addParameter[LocalVariableDescriptor]

'result' @ [122:9] ==> value-parameter result: MutableSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.addParameter[ValueParameterDescriptorImpl]

'add' @ [122:16] ==> public abstract fun add(element: PsiElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'method' @ [122:20] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.addParameter[ValueParameterDescriptorImpl]

'parameterList' @ [122:27] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [122:41] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'parameterIndex' @ [122:52] ==> val parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.addParameter[LocalVariableDescriptor]

