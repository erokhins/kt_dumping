'unwrapped' @ [55:26] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'originalElement' @ [55:37] ==> public final val PsiElement.originalElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when {
                target is KtPropertyAccessor -> target.getNonStrictParentOfType<KtProperty>()
                else -> target
            }' @ [56:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'target' @ [57:17] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.references.<get-unwrappedTargets>.adjust[LocalVariableDescriptor]

'target' @ [57:49] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.references.<get-unwrappedTargets>.adjust[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [57:56] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'target' @ [58:25] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.references.<get-unwrappedTargets>.adjust[LocalVariableDescriptor]

'when (this) {
            is PsiPolyVariantReference -> multiResolve(false).mapNotNullTo(HashSet<PsiElement>()) { it.element?.adjust() }
            else -> listOfNotNull(resolve()?.adjust()).toSet()
        }' @ [62:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Set<PsiElement>, entry1: Set<PsiElement>): Set<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Set<PsiElement>

'this' @ [62:22] ==> <this> defined in org.jetbrains.kotlin.idea.references.unwrappedTargets[ReceiverParameterDescriptorImpl]

'multiResolve' @ [63:43] ==> @NotNull public abstract fun multiResolve(p0: Boolean): (Array<(ResolveResult..ResolveResult?)>..Array<out (ResolveResult..ResolveResult?)>) defined in com.intellij.psi.PsiPolyVariantReference[JavaMethodDescriptor]

'mapNotNullTo' @ [63:63] ==> public inline fun <T, R : Any, C : MutableCollection<in PsiElement>> Array<out (ResolveResult..ResolveResult?)>.mapNotNullTo(destination: HashSet<PsiElement>, transform: ((ResolveResult..ResolveResult?)) -> PsiElement?): HashSet<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.ResolveResult..com.intellij.psi.ResolveResult?)
    <R : Any> -> PsiElement
    <C : MutableCollection<in R>> -> HashSet<PsiElement>

'HashSet' @ [63:76] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'it' @ [63:101] ==> value-parameter it: (ResolveResult..ResolveResult?) defined in org.jetbrains.kotlin.idea.references.<get-unwrappedTargets>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [63:104] ==> public final val ResolveResult.element: PsiElement?[MyPropertyDescriptor]

'adjust' @ [63:113] ==> local final fun PsiElement.adjust(): PsiElement? defined in org.jetbrains.kotlin.idea.references.<get-unwrappedTargets>[SimpleFunctionDescriptorImpl]

'listOfNotNull' @ [64:21] ==> public fun <T : Any> listOfNotNull(element: PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

'resolve' @ [64:35] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'adjust' @ [64:46] ==> local final fun PsiElement.adjust(): PsiElement? defined in org.jetbrains.kotlin.idea.references.<get-unwrappedTargets>[SimpleFunctionDescriptorImpl]

'toSet' @ [64:56] ==> public fun <T> Iterable<PsiElement>.toSet(): Set<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'element' @ [71:12] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'containingFile' @ [71:20] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'candidateTarget' @ [71:38] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.canBeReferenceTo[ValueParameterDescriptorImpl]

'containingFile' @ [71:54] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'ProjectRootsUtil' @ [72:15] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[FakeCallableDescriptorForObject]

'isInProjectOrLibSource' @ [72:32] ==> @JvmStatic public final fun isInProjectOrLibSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'element' @ [72:55] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [76:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canBeReferenceTo' @ [76:10] ==> public fun PsiReference.canBeReferenceTo(candidateTarget: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[SimpleFunctionDescriptorImpl]

'candidateTarget' @ [76:27] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'candidateTarget' @ [78:30] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'unwrapped' @ [78:46] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'originalElement' @ [78:57] ==> public final val PsiElement.originalElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (this) {
        is KtInvokeFunctionReference -> {
            if (candidateTarget !is KtNamedFunction && candidateTarget !is PsiMethod) return false
            if ((candidateTarget as PsiNamedElement).name != OperatorNameConventions.INVOKE.asString()) {
                return false
            }
        }
        is KtDestructuringDeclarationReference -> {
            if (candidateTarget !is KtNamedFunction && candidateTarget !is KtParameter && candidateTarget !is PsiMethod) return false
        }
        is KtSimpleNameReference -> {
            if (unwrappedCandidate is PsiMethod && !canBePsiMethodReference()) return false
        }
    }' @ [81:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'this' @ [81:11] ==> <this> defined in org.jetbrains.kotlin.idea.references.matchesTarget[ReceiverParameterDescriptorImpl]

'candidateTarget' @ [83:17] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'candidateTarget' @ [83:56] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'!=' @ [84:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'candidateTarget' @ [84:18] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'name' @ [84:54] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'INVOKE' @ [84:86] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'asString' @ [84:93] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'candidateTarget' @ [89:17] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'candidateTarget' @ [89:56] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'candidateTarget' @ [89:91] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'unwrappedCandidate' @ [92:17] ==> val unwrappedCandidate: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'!' @ [92:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canBePsiMethodReference' @ [92:53] ==> public fun KtSimpleNameReference.canBePsiMethodReference(): Boolean defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[SimpleFunctionDescriptorImpl]

'element' @ [96:19] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'candidateTarget' @ [98:9] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'element' @ [98:45] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'element' @ [98:82] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'getReferencedName' @ [98:90] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'candidateTarget' @ [98:113] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'name' @ [98:129] ==> public final val KtImportAlias.name: String?[MyPropertyDescriptor]

'candidateTarget' @ [99:31] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'importDirective' @ [99:47] ==> public final val importDirective: KtImportDirective? defined in org.jetbrains.kotlin.psi.KtImportAlias[DeserializedPropertyDescriptor]

'importDirective' @ [100:30] ==> val importDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'importedFqName' @ [100:46] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'importDirective' @ [101:35] ==> val importDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'containingKtFile' @ [101:51] ==> public final val KtImportDirective.containingKtFile: KtFile[MyPropertyDescriptor]

'resolveImportReference' @ [101:68] ==> public fun KtFile.resolveImportReference(fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'importedFqName' @ [101:91] ==> val importedFqName: FqName defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'unwrappedTargets' @ [102:33] ==> public val PsiReference.unwrappedTargets: Set<PsiElement> defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'mapNotNull' @ [102:50] ==> public inline fun <T, R : Any> Iterable<PsiElement>.mapNotNull(transform: (PsiElement) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R : Any> -> PsiElement

'if (it is KtConstructor<*>) it.containingClassOrObject else it' @ [103:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'it' @ [103:17] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [103:41] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [103:44] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'it' @ [103:73] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'importedDescriptors' @ [105:16] ==> val importedDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'any' @ [105:36] ==> public inline fun <T> Iterable<DeclarationDescriptor>.any(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'in' @ [105:42] ==> public operator fun <@OnlyInputTypes T> Iterable<PsiElement?>.contains(element: PsiElement?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PsiElement?

'it' @ [105:43] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [105:84] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [105:92] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'importableTargets' @ [105:104] ==> val importableTargets: List<PsiElement> defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'element' @ [108:9] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'element' @ [109:28] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'parent' @ [109:36] ==> public final val KtLabelReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [109:65] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (labelParent) {
            is KtReturnExpression -> unwrappedTargets.forEach {
                if (it !is KtFunctionLiteral && !(it is KtNamedFunction && it.name.isNullOrEmpty())) return@forEach
                it as KtFunction

                val labeledExpression = it.getLabeledParent(element.getReferencedName())
                if (labeledExpression != null) {
                    if (candidateTarget == labeledExpression) return true else return@forEach
                }
                val calleeReference = it.getCalleeByLambdaArgument()?.mainReference ?: return@forEach
                if (calleeReference.matchesTarget(candidateTarget)) return true
            }
            is KtBreakExpression, is KtContinueExpression -> unwrappedTargets.forEach {
                val labeledExpression = (it as? KtExpression)?.getLabeledParent(element.getReferencedName()) ?: return@forEach
                if (candidateTarget == labeledExpression) return true
            }
        }' @ [110:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'labelParent' @ [110:15] ==> val labelParent: PsiElement? defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'unwrappedTargets' @ [111:38] ==> public val PsiReference.unwrappedTargets: Set<PsiElement> defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'forEach' @ [111:55] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [112:21] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [112:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [112:51] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [112:76] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [112:79] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'isNullOrEmpty' @ [112:84] ==> @InlineOnly public inline fun CharSequence?.isNullOrEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [113:17] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [115:41] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'getLabeledParent' @ [115:44] ==> public fun KtExpression.getLabeledParent(labelName: String): KtLabeledExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [115:61] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'getReferencedName' @ [115:69] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtLabelReferenceExpression[DeserializedSimpleFunctionDescriptor]

'labeledExpression' @ [116:21] ==> val labeledExpression: KtLabeledExpression? defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[LocalVariableDescriptor]

'if (candidateTarget == labeledExpression) return true else return@forEach' @ [117:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'candidateTarget' @ [117:25] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'labeledExpression' @ [117:44] ==> val labeledExpression: KtLabeledExpression? defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[LocalVariableDescriptor]

'it' @ [119:39] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'getCalleeByLambdaArgument' @ [119:42] ==> public fun KtFunction.getCalleeByLambdaArgument(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[SimpleFunctionDescriptorImpl]

'mainReference' @ [119:71] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'calleeReference' @ [120:21] ==> val calleeReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[LocalVariableDescriptor]

'matchesTarget' @ [120:37] ==> public fun PsiReference.matchesTarget(candidateTarget: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[SimpleFunctionDescriptorImpl]

'candidateTarget' @ [120:51] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'unwrappedTargets' @ [122:62] ==> public val PsiReference.unwrappedTargets: Set<PsiElement> defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'forEach' @ [122:79] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'?:' @ [123:41] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtLabeledExpression?, right: KtLabeledExpression): KtLabeledExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtLabeledExpression

'it' @ [123:42] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'getLabeledParent' @ [123:64] ==> public fun KtExpression.getLabeledParent(labelName: String): KtLabeledExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [123:81] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'getReferencedName' @ [123:89] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtLabelReferenceExpression[DeserializedSimpleFunctionDescriptor]

'candidateTarget' @ [124:21] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'labeledExpression' @ [124:40] ==> val labeledExpression: KtLabeledExpression defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[LocalVariableDescriptor]

'unwrappedTargets' @ [129:19] ==> public val PsiReference.unwrappedTargets: Set<PsiElement> defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'candidateTarget' @ [130:19] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'manager' @ [130:35] ==> public final val PsiElement.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'targets' @ [131:9] ==> val targets: Set<PsiElement> defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'any' @ [131:17] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'manager' @ [131:23] ==> val manager: (PsiManager..PsiManager?) defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'areElementsEquivalent' @ [131:31] ==> public abstract fun areElementsEquivalent(@Nullable p0: PsiElement?, @Nullable p1: PsiElement?): Boolean defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'unwrappedCandidate' @ [131:53] ==> val unwrappedCandidate: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'it' @ [131:73] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'if (this is KtReference) {
        return targets.any {
            it.isConstructorOf(unwrappedCandidate)
            || it is KtObjectDeclaration && it.isCompanion() && it.getNonStrictParentOfType<KtClass>() == unwrappedCandidate
        }
    }
    // TODO: Workaround for Kotlin constructor search in Java code. To be removed after refactoring of the search API
    else if (this is PsiJavaCodeReferenceElement && unwrappedCandidate is KtConstructor<*>) {
        var parent = getElement().parent
        if (parent is PsiAnonymousClass) {
            parent = parent.getParent()
        }
        if ((parent as? PsiNewExpression)?.resolveConstructor()?.unwrapped == unwrappedCandidate) return true
    }' @ [135:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'this' @ [135:9] ==> <this> defined in org.jetbrains.kotlin.idea.references.matchesTarget[ReceiverParameterDescriptorImpl]

'targets' @ [136:16] ==> val targets: Set<PsiElement> defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'any' @ [136:24] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [137:13] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'isConstructorOf' @ [137:16] ==> private fun PsiElement.isConstructorOf(unwrappedCandidate: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[SimpleFunctionDescriptorImpl]

'unwrappedCandidate' @ [137:32] ==> val unwrappedCandidate: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'it' @ [138:16] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [138:45] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'isCompanion' @ [138:48] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'it' @ [138:65] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [138:68] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'unwrappedCandidate' @ [138:107] ==> val unwrappedCandidate: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'this' @ [142:14] ==> <this> defined in org.jetbrains.kotlin.idea.references.matchesTarget[ReceiverParameterDescriptorImpl]

'unwrappedCandidate' @ [142:53] ==> val unwrappedCandidate: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'getElement' @ [143:22] ==> public abstract fun getElement(): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'parent' @ [143:35] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [144:13] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'parent' @ [145:13] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'parent' @ [145:22] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'getParent' @ [145:29] ==> @Contract public abstract fun getParent(): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'==' @ [147:13] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiElement[DeserializedSimpleFunctionDescriptor]

'parent' @ [147:14] ==> var parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'resolveConstructor' @ [147:44] ==> @Nullable public abstract fun resolveConstructor(): PsiMethod? defined in com.intellij.psi.PsiNewExpression[JavaMethodDescriptor]

'unwrapped' @ [147:66] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'unwrappedCandidate' @ [147:79] ==> val unwrappedCandidate: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'this' @ [149:9] ==> <this> defined in org.jetbrains.kotlin.idea.references.matchesTarget[ReceiverParameterDescriptorImpl]

'candidateTarget' @ [149:48] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'unwrappedTargets' @ [149:90] ==> public val PsiReference.unwrappedTargets: Set<PsiElement> defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'size' @ [149:107] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'unwrappedTargets' @ [150:29] ==> public val PsiReference.unwrappedTargets: Set<PsiElement> defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'first' @ [150:46] ==> public fun <T> Iterable<PsiElement>.first(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'referredClass' @ [151:13] ==> val referredClass: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'candidateTarget' @ [151:41] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'referredClass' @ [151:60] ==> val referredClass: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[LocalVariableDescriptor]

'companionObjects' @ [151:74] ==> public final val KtClass.companionObjects: List<KtObjectDeclaration>[MyPropertyDescriptor]

'parent' @ [152:17] ==> public final val PsiJavaCodeReferenceElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [154:20] ==> public final val PsiJavaCodeReferenceElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'reference' @ [154:27] ==> public final val PsiElement.reference: PsiReference?[MyPropertyDescriptor]

'unwrappedTargets' @ [154:38] ==> public val PsiReference.unwrappedTargets: Set<PsiElement> defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'any' @ [154:56] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [155:18] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [155:38] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [155:64] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [155:67] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [155:75] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'candidateTarget' @ [155:85] ==> value-parameter candidateTarget: PsiElement defined in org.jetbrains.kotlin.idea.references.matchesTarget[ValueParameterDescriptorImpl]

'element' @ [164:9] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'element' @ [164:21] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'parent' @ [164:29] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'calleeExpression' @ [164:59] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [166:29] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'getParentOfTypeAndBranch' @ [166:37] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallableReferenceExpression.() -> PsiElement?): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallableReferenceExpression

'callableReference' @ [166:95] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'callableReference' @ [167:9] ==> val callableReference: KtCallableReferenceExpression? defined in org.jetbrains.kotlin.idea.references.canBePsiMethodReference[LocalVariableDescriptor]

'element' @ [169:26] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'getParentOfTypeAndBranch' @ [169:34] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtBinaryExpression.() -> PsiElement?): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBinaryExpression

'operationReference' @ [169:81] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'binaryOperator' @ [170:9] ==> val binaryOperator: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.references.canBePsiMethodReference[LocalVariableDescriptor]

'element' @ [172:25] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'getParentOfTypeAndBranch' @ [172:33] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtUnaryExpression.() -> PsiElement?): KtUnaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUnaryExpression

'operationReference' @ [172:79] ==> public final val KtUnaryExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'unaryOperator' @ [173:9] ==> val unaryOperator: KtUnaryExpression? defined in org.jetbrains.kotlin.idea.references.canBePsiMethodReference[LocalVariableDescriptor]

'element' @ [175:9] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [175:17] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'this' @ [182:10] ==> <this> defined in org.jetbrains.kotlin.idea.references.isConstructorOf[ReceiverParameterDescriptorImpl]

'isConstructor' @ [182:31] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'containingClass' @ [182:48] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'unwrappedCandidate' @ [182:67] ==> value-parameter unwrappedCandidate: PsiElement defined in org.jetbrains.kotlin.idea.references.isConstructorOf[ValueParameterDescriptorImpl]

'this' @ [184:6] ==> <this> defined in org.jetbrains.kotlin.idea.references.isConstructorOf[ReceiverParameterDescriptorImpl]

'getContainingClassOrObject' @ [184:34] ==> public abstract fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtConstructor[DeserializedSimpleFunctionDescriptor]

'unwrappedCandidate' @ [184:66] ==> value-parameter unwrappedCandidate: PsiElement defined in org.jetbrains.kotlin.idea.references.isConstructorOf[ValueParameterDescriptorImpl]

'newName' @ [187:9] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.references.renameImplicitConventionalCall[ValueParameterDescriptorImpl]

'expression' @ [187:33] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[PropertyDescriptorImpl]

'component1' @ [189:10] ==> public final operator fun component1(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [189:25] ==> public final operator fun component2(): KtSimpleNameExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'OperatorToFunctionIntention' @ [189:43] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention[FakeCallableDescriptorForObject]

'convert' @ [189:71] ==> public final fun convert(element: KtExpression): Pair<KtExpression, KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [189:79] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.references.AbstractKtReference[PropertyDescriptorImpl]

'newNameElement' @ [190:5] ==> val newNameElement: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.renameImplicitConventionalCall[LocalVariableDescriptor]

'mainReference' @ [190:20] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'handleElementRename' @ [190:34] ==> public open fun handleElementRename(newElementName: String?): PsiElement defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[SimpleFunctionDescriptorImpl]

'newName' @ [190:54] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.references.renameImplicitConventionalCall[ValueParameterDescriptorImpl]

'newExpression' @ [191:12] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.references.renameImplicitConventionalCall[LocalVariableDescriptor]

'references' @ [195:13] ==> public final val KtSimpleNameExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstance' @ [195:24] ==> public inline fun <reified T> Array<*>.firstIsInstance(): KtSimpleNameReference defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtSimpleNameReference

'if (this is KtSimpleNameExpression) mainReference else references.firstIsInstance<KtReference>()' @ [198:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtReference, elseBranch: KtReference): KtReference[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtReference

'this' @ [198:17] ==> <this> defined in org.jetbrains.kotlin.idea.references.mainReference[ReceiverParameterDescriptorImpl]

'mainReference' @ [198:49] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'references' @ [198:68] ==> public final val KtReferenceExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstance' @ [198:79] ==> public inline fun <reified T> Array<*>.firstIsInstance(): KtReference defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtReference

'references' @ [201:13] ==> public final val KDocName.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstance' @ [201:24] ==> public inline fun <reified T> Array<*>.firstIsInstance(): KDocReference defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KDocReference

'when {
            this is KtReferenceExpression -> mainReference
            this is KDocName -> mainReference
            else -> references.firstIsInstanceOrNull<KtReference>()
        }' @ [205:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtReference?, entry1: KtReference?, entry2: KtReference?): KtReference?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtReference?

'this' @ [206:13] ==> <this> defined in org.jetbrains.kotlin.idea.references.mainReference[ReceiverParameterDescriptorImpl]

'mainReference' @ [206:46] ==> public val KtReferenceExpression.mainReference: KtReference defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'this' @ [207:13] ==> <this> defined in org.jetbrains.kotlin.idea.references.mainReference[ReceiverParameterDescriptorImpl]

'mainReference' @ [207:33] ==> public val KDocName.mainReference: KDocReference defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'references' @ [208:21] ==> public final val KtElement.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstanceOrNull' @ [208:32] ==> public inline fun <reified T : Any> Array<*>.firstIsInstanceOrNull(): KtReference? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtReference

'analyze' @ [213:26] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [213:50] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'mainReference' @ [214:12] ==> public val KtElement.mainReference: KtReference? defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'resolveToDescriptors' @ [214:27] ==> public abstract fun resolveToDescriptors(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtReference[SimpleFunctionDescriptorImpl]

'bindingContext' @ [214:48] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.references.resolveMainReferenceToDescriptors[LocalVariableDescriptor]

'emptyList' @ [214:67] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'' @ [220:9] ==> private constructor ReferenceAccess(isRead: Boolean, isWrite: Boolean) defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[ClassConstructorDescriptorImpl]

'' @ [220:29] ==> private constructor ReferenceAccess(isRead: Boolean, isWrite: Boolean) defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[ClassConstructorDescriptorImpl]

'' @ [220:54] ==> private constructor ReferenceAccess(isRead: Boolean, isWrite: Boolean) defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[ClassConstructorDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [224:22] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [226:22] ==> var expression: KtExpression defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'parent' @ [226:33] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtParenthesizedExpression, is KtAnnotatedExpression, is KtLabeledExpression -> expression = parent as KtExpression
            else -> break@loop
        }' @ [227:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [227:15] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'expression' @ [228:95] ==> var expression: KtExpression defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'parent' @ [228:108] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'expression' @ [233:22] ==> var expression: KtExpression defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'getAssignmentByLHS' @ [233:33] ==> public fun KtExpression.getAssignmentByLHS(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'assignment' @ [234:9] ==> val assignment: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'when (assignment.operationToken) {
            KtTokens.EQ -> return ReferenceAccess.WRITE

            else -> {
                if (!useResolveForReadWrite) return ReferenceAccess.READ_WRITE

                val bindingContext = assignment.analyze(BodyResolveMode.PARTIAL)
                val resolvedCall = assignment.getResolvedCall(bindingContext) ?: return ReferenceAccess.READ_WRITE
                if (!resolvedCall.isReallySuccess()) return ReferenceAccess.READ_WRITE
                return if (resolvedCall.resultingDescriptor.name in OperatorConventions.ASSIGNMENT_OPERATIONS.values)
                    ReferenceAccess.READ
                else
                    ReferenceAccess.READ_WRITE
            }
        }' @ [235:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'assignment' @ [235:15] ==> val assignment: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'operationToken' @ [235:26] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [236:22] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'WRITE' @ [236:51] ==> enum entry WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'!' @ [239:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'useResolveForReadWrite' @ [239:22] ==> value-parameter useResolveForReadWrite: Boolean defined in org.jetbrains.kotlin.idea.references.readWriteAccess[ValueParameterDescriptorImpl]

'READ_WRITE' @ [239:69] ==> enum entry READ_WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'assignment' @ [241:38] ==> val assignment: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'analyze' @ [241:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [241:73] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assignment' @ [242:36] ==> val assignment: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'getResolvedCall' @ [242:47] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [242:63] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'READ_WRITE' @ [242:105] ==> enum entry READ_WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'!' @ [243:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [243:22] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'isReallySuccess' @ [243:35] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'READ_WRITE' @ [243:77] ==> enum entry READ_WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'if (resolvedCall.resultingDescriptor.name in OperatorConventions.ASSIGNMENT_OPERATIONS.values)
                    ReferenceAccess.READ
                else
                    ReferenceAccess.READ_WRITE' @ [244:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReferenceAccess, elseBranch: ReferenceAccess): ReferenceAccess[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReferenceAccess

'resolvedCall' @ [244:28] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'resultingDescriptor' @ [244:41] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'name' @ [244:61] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'ASSIGNMENT_OPERATIONS' @ [244:89] ==> public final val ASSIGNMENT_OPERATIONS: (ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>..ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'values' @ [244:111] ==> public open val values: ImmutableSet<(Name..Name?)> defined in com.google.common.collect.ImmutableBiMap[JavaPropertyDescriptor]

'READ' @ [245:37] ==> enum entry READ defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'READ_WRITE' @ [247:37] ==> enum entry READ_WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'if ((expression.parent as? KtUnaryExpression)?.operationToken in constant { setOf(KtTokens.PLUSPLUS, KtTokens.MINUSMINUS) })
        ReferenceAccess.READ_WRITE
    else
        ReferenceAccess.READ' @ [252:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReferenceAccess, elseBranch: ReferenceAccess): ReferenceAccess[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReferenceAccess

'in' @ [252:16] ==> public operator fun <@OnlyInputTypes T> Iterable<IElementType?>.contains(element: IElementType?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IElementType?

'expression' @ [252:17] ==> var expression: KtExpression defined in org.jetbrains.kotlin.idea.references.readWriteAccess[LocalVariableDescriptor]

'parent' @ [252:28] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'operationToken' @ [252:59] ==> public final val KtUnaryExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'constant' @ [252:77] ==> public fun <T : Any> constant(calculator: () -> Set<(KtSingleValueToken..KtSingleValueToken?)>): Set<(KtSingleValueToken..KtSingleValueToken?)> defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Set<(org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)>

'setOf' @ [252:88] ==> public fun <T> setOf(vararg elements: (KtSingleValueToken..KtSingleValueToken?)): Set<(KtSingleValueToken..KtSingleValueToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)

'PLUSPLUS' @ [252:103] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUSMINUS' @ [252:122] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'READ_WRITE' @ [253:25] ==> enum entry READ_WRITE defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'READ' @ [255:25] ==> enum entry READ defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'!' @ [259:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'target' @ [259:10] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[ValueParameterDescriptorImpl]

'canBeReferencedViaImport' @ [259:17] ==> public fun DeclarationDescriptor.canBeReferencedViaImport(): Boolean defined in org.jetbrains.kotlin.idea.imports[DeserializedSimpleFunctionDescriptor]

'this' @ [261:9] ==> <this> defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[ReceiverParameterDescriptorImpl]

'element' @ [261:39] ==> public final val KDocReference.element: (KDocName..KDocName?)[MyPropertyDescriptor]

'getQualifiedName' @ [261:47] ==> public final fun getQualifiedName(): List<String> defined in org.jetbrains.kotlin.kdoc.psi.impl.KDocName[DeserializedSimpleFunctionDescriptor]

'size' @ [261:66] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'target' @ [263:9] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[ValueParameterDescriptorImpl]

'isExtension' @ [263:16] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'this' @ [265:31] ==> <this> defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[ReceiverParameterDescriptorImpl]

'element' @ [265:36] ==> public final val KtReference.element: KtElement[MyPropertyDescriptor]

'CallTypeAndReceiver' @ [266:31] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'detect' @ [266:51] ==> public final fun detect(expression: KtSimpleNameExpression): CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.Companion[DeserializedSimpleFunctionDescriptor]

'referenceExpression' @ [266:58] ==> val referenceExpression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[LocalVariableDescriptor]

'callTypeAndReceiver' @ [268:9] ==> val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[LocalVariableDescriptor]

'receiver' @ [268:29] ==> public final val receiver: KtElement? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'target' @ [269:13] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[ValueParameterDescriptorImpl]

'!' @ [269:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'target' @ [269:47] ==> value-parameter target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[ValueParameterDescriptorImpl]

'type' @ [269:54] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'isExtensionFunctionType' @ [269:59] ==> public val KotlinType.isExtensionFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'callTypeAndReceiver' @ [270:13] ==> val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[LocalVariableDescriptor]

'callTypeAndReceiver' @ [270:64] ==> val callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[LocalVariableDescriptor]

'bindingContext' @ [272:28] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[ValueParameterDescriptorImpl]

'CALL' @ [272:58] ==> public final val CALL: (WritableSlice<(KtElement..KtElement?), (Call..Call?)>..WritableSlice<(KtElement..KtElement?), (Call..Call?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'referenceExpression' @ [272:64] ==> val referenceExpression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[LocalVariableDescriptor]

'getResolvedCall' @ [272:85] ==> public fun Call?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [272:101] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[ValueParameterDescriptorImpl]

'resolvedCall' @ [274:13] ==> val resolvedCall: VariableAsFunctionResolvedCall defined in org.jetbrains.kotlin.idea.references.canBeResolvedViaImport[LocalVariableDescriptor]

'variableCall' @ [274:26] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'explicitReceiverKind' @ [274:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<VariableDescriptor>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'isDispatchReceiver' @ [274:60] ==> public final val ExplicitReceiverKind.isDispatchReceiver: Boolean[MyPropertyDescriptor]

'element' @ [277:9] ==> public final val KtReference.element: KtElement[MyPropertyDescriptor]

'parent' @ [277:17] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [277:47] ==> public final val KtReference.element: KtElement[MyPropertyDescriptor]

'parent' @ [277:55] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfTypeAndBranch' @ [283:20] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtValueArgument.() -> PsiElement?): KtValueArgument? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtValueArgument

'getArgumentExpression' @ [283:64] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'when (argument) {
                             is KtLambdaArgument -> argument.parent as? KtCallExpression
                             else -> (argument.parent as? KtValueArgumentList)?.parent as? KtCallExpression
                         }' @ [284:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtCallExpression?, entry1: KtCallExpression?): KtCallExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtCallExpression?

'argument' @ [284:32] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.references.getCalleeByLambdaArgument[LocalVariableDescriptor]

'argument' @ [285:53] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.references.getCalleeByLambdaArgument[LocalVariableDescriptor]

'parent' @ [285:62] ==> public final val KtLambdaArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'argument' @ [286:39] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.references.getCalleeByLambdaArgument[LocalVariableDescriptor]

'parent' @ [286:48] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [286:81] ==> public final val KtValueArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpression' @ [288:12] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.references.getCalleeByLambdaArgument[LocalVariableDescriptor]

'calleeExpression' @ [288:27] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

