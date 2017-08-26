'ResolveSnapshotProvider' @ [39:39] ==> public constructor ResolveSnapshotProvider() defined in com.intellij.refactoring.rename.ResolveSnapshotProvider[JavaClassConstructorDescriptor]

'ResolveSnapshot' @ [40:63] ==> public constructor ResolveSnapshot() defined in com.intellij.refactoring.rename.ResolveSnapshotProvider.ResolveSnapshot[JavaClassConstructorDescriptor]

'scope' @ [41:31] ==> value-parameter scope: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot[ValueParameterDescriptorImpl]

'project' @ [41:37] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'!!' @ [42:32] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Document?): Document[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Document

'getInstance' @ [42:51] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [42:63] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>[PropertyDescriptorImpl]

'getDocument' @ [42:72] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'scope' @ [42:84] ==> value-parameter scope: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot[ValueParameterDescriptorImpl]

'containingFile' @ [42:90] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'HashMap' @ [43:49] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SmartPsiElementPointer<*>
    <V : (Any..Any?)> -> PropertyDescriptor

'scope' @ [46:13] ==> value-parameter scope: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot[ValueParameterDescriptorImpl]

'accept' @ [46:19] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [47:29] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [49:33] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.<init>.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelector' @ [49:44] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'super' @ [49:96] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.<init>.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitSimpleNameExpression' @ [49:102] ==> public open fun visitSimpleNameExpression(@NotNull p0: KtSimpleNameExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'expression' @ [49:128] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.<init>.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'expression' @ [50:52] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.<init>.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'resolveMainReferenceToDescriptors' @ [50:63] ==> public fun KtElement.resolveMainReferenceToDescriptors(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references[DeserializedSimpleFunctionDescriptor]

'singleOrNull' @ [50:99] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'targetDescriptor' @ [51:33] ==> val targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.<init>.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'refExpressionToDescriptor' @ [52:29] ==> private final val refExpressionToDescriptor: HashMap<SmartPsiElementPointer<*>, PropertyDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>[PropertyDescriptorImpl]

'expression' @ [52:55] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.<init>.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'createSmartPointer' @ [52:66] ==> public fun <E : PsiElement> KtSimpleNameExpression.createSmartPointer(): SmartPsiElementPointer<KtSimpleNameExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> KtSimpleNameExpression

'targetDescriptor' @ [52:90] ==> val targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.<init>.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'getInstance' @ [59:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [59:44] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>[PropertyDescriptorImpl]

'commitDocument' @ [59:53] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [59:68] ==> private final val document: Document defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>[PropertyDescriptorImpl]

'ArrayList' @ [61:37] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'component1' @ [62:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(SmartPsiElementPointer<*>..SmartPsiElementPointer<*>?), (PropertyDescriptor..PropertyDescriptor?)>.component1(): (SmartPsiElementPointer<*>..SmartPsiElementPointer<*>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.psi.SmartPsiElementPointer<*>..com.intellij.psi.SmartPsiElementPointer<*>?)
    <V> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'component2' @ [62:35] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(SmartPsiElementPointer<*>..SmartPsiElementPointer<*>?), (PropertyDescriptor..PropertyDescriptor?)>.component2(): (PropertyDescriptor..PropertyDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.psi.SmartPsiElementPointer<*>..com.intellij.psi.SmartPsiElementPointer<*>?)
    <V> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)

'refExpressionToDescriptor' @ [62:56] ==> private final val refExpressionToDescriptor: HashMap<SmartPsiElementPointer<*>, PropertyDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>[PropertyDescriptorImpl]

'refExprPointer' @ [63:31] ==> val refExprPointer: (SmartPsiElementPointer<*>..SmartPsiElementPointer<*>?) defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

'element' @ [63:46] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<out (PsiElement..PsiElement?)>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)

'refExpr' @ [64:21] ==> val refExpr: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

'text' @ [64:29] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'name' @ [64:37] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[ValueParameterDescriptorImpl]

'targetDescriptor' @ [65:44] ==> val targetDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

'containingDeclaration' @ [65:61] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (containingDescriptor is ClassDescriptor) {
                    "${containingDescriptor.explicateAsTextForReceiver()}.${targetDescriptor.name.asString()}"
                }
                else {
                    targetDescriptor.importableFqName?.asString() ?: continue
                }' @ [66:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'containingDescriptor' @ [66:44] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

'containingDescriptor' @ [67:24] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

'explicateAsTextForReceiver' @ [67:45] ==> internal fun DeclarationDescriptor.explicateAsTextForReceiver(): String defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'targetDescriptor' @ [67:77] ==> val targetDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

'name' @ [67:94] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [67:99] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'targetDescriptor' @ [70:21] ==> val targetDescriptor: (PropertyDescriptor..PropertyDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

'importableFqName' @ [70:38] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'asString' @ [70:56] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'KtPsiFactory' @ [72:40] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [72:53] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>[PropertyDescriptorImpl]

'createExpression' @ [72:62] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'qualifiedRefText' @ [72:79] ==> val qualifiedRefText: String defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

'elementsToShorten' @ [73:17] ==> val elementsToShorten: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

'refExpr' @ [73:38] ==> val refExpr: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

'replaced' @ [73:46] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'qualifiedRefExpr' @ [73:55] ==> val qualifiedRefExpr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

'ShortenReferences' @ [75:13] ==> public constructor ShortenReferences(options: (KtElement) -> ShortenReferences.Options = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedClassConstructorDescriptor]

'ShortenReferences' @ [75:33] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'ALL_ENABLED' @ [75:59] ==> public final val ALL_ENABLED: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options.Companion[DeserializedPropertyDescriptor]

'process' @ [75:73] ==> @JvmOverloads public final fun process(elements: Iterable<KtElement>, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): Collection<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'elementsToShorten' @ [75:81] ==> val elementsToShorten: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.rename.KotlinResolveSnapshotProvider.createSnapshot.<no name provided>.apply[LocalVariableDescriptor]

