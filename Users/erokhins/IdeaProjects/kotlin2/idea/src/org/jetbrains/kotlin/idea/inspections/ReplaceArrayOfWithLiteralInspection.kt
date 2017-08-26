'AbstractKotlinInspection' @ [31:45] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [34:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [36:17] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitCallExpression' @ [36:23] ==> public open fun visitCallExpression(@NotNull p0: KtCallExpression): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'expression' @ [36:43] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'!' @ [38:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [38:22] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [38:33] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'supportsFeature' @ [38:57] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'ArrayLiteralsInAnnotations' @ [38:73] ==> enum entry ArrayLiteralsInAnnotations defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'!' @ [39:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [39:41] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [39:58] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'expression' @ [41:40] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'calleeExpression' @ [41:51] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [42:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [42:22] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'isArrayOfMethod' @ [42:33] ==> public fun KtCallExpression.isArrayOfMethod(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [44:30] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'parent' @ [44:41] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                    is KtValueArgument -> parent.parent.parent as? KtAnnotationEntry ?: return
                    is KtParameter -> {
                        val constructor = parent.parent.parent as? KtPrimaryConstructor ?: return
                        val containingClass = constructor.getContainingClassOrObject()
                        if (!containingClass.isAnnotation()) return
                    }
                    else -> return
                }' @ [45:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'parent' @ [45:23] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'parent' @ [46:43] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'parent' @ [46:50] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [46:57] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [48:43] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'parent' @ [48:50] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [48:57] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'constructor' @ [49:47] ==> val constructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'getContainingClassOrObject' @ [49:59] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'!' @ [50:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [50:30] ==> val containingClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'isAnnotation' @ [50:46] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'calleeExpression' @ [55:34] ==> val calleeExpression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'getReferencedName' @ [55:51] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'holder' @ [56:17] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [56:24] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'calleeExpression' @ [57:25] ==> val calleeExpression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'calleeName' @ [58:28] ==> val calleeName: String defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.buildVisitor.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [59:46] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'ReplaceWithArrayLiteralFix' @ [60:25] ==> public constructor ReplaceWithArrayLiteralFix() defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.ReplaceWithArrayLiteralFix[ClassConstructorDescriptorImpl]

'descriptor' @ [70:36] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.ReplaceWithArrayLiteralFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [70:47] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'calleeExpression' @ [71:34] ==> val calleeExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.ReplaceWithArrayLiteralFix.applyFix[LocalVariableDescriptor]

'parent' @ [71:51] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpression' @ [72:29] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.ReplaceWithArrayLiteralFix.applyFix[LocalVariableDescriptor]

'valueArguments' @ [72:44] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'KtPsiFactory' @ [73:32] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'callExpression' @ [73:45] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.ReplaceWithArrayLiteralFix.applyFix[LocalVariableDescriptor]

'buildExpression' @ [73:61] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [74:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'component1' @ [75:23] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [75:30] ==> public final operator fun component2(): (KtValueArgument..KtValueArgument?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'arguments' @ [75:43] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.ReplaceWithArrayLiteralFix.applyFix[LocalVariableDescriptor]

'withIndex' @ [75:53] ==> public fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.withIndex(): Iterable<IndexedValue<(KtValueArgument..KtValueArgument?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'appendExpression' @ [76:21] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'argument' @ [76:38] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.ReplaceWithArrayLiteralFix.applyFix.<anonymous>[LocalVariableDescriptor]

'getArgumentExpression' @ [76:47] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'index' @ [77:25] ==> val index: Int defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.ReplaceWithArrayLiteralFix.applyFix.<anonymous>[LocalVariableDescriptor]

'arguments' @ [77:34] ==> val arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>) defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.ReplaceWithArrayLiteralFix.applyFix[LocalVariableDescriptor]

'size' @ [77:44] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'appendFixedText' @ [78:25] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [81:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'callExpression' @ [83:13] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.ReplaceWithArrayLiteralFix.applyFix[LocalVariableDescriptor]

'replace' @ [83:28] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtCallExpression[DeserializedSimpleFunctionDescriptor]

'arrayLiteral' @ [83:36] ==> val arrayLiteral: KtCollectionLiteralExpression defined in org.jetbrains.kotlin.idea.inspections.ReplaceArrayOfWithLiteralInspection.ReplaceWithArrayLiteralFix.applyFix[LocalVariableDescriptor]

