'FqName' @ [52:28] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'PROPERTY_KEY' @ [52:50] ==> public const final val PROPERTY_KEY: String defined in com.intellij.codeInsight.AnnotationUtil[JavaPropertyDescriptor]

'identifier' @ [53:49] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'PROPERTY_KEY_RESOURCE_BUNDLE_PARAMETER' @ [53:75] ==> public const final val PROPERTY_KEY_RESOURCE_BUNDLE_PARAMETER: String defined in com.intellij.codeInsight.AnnotationUtil[JavaPropertyDescriptor]

'allValueArguments' @ [56:12] ==> public abstract val allValueArguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'PROPERTY_KEY_RESOURCE_BUNDLE' @ [56:30] ==> private val PROPERTY_KEY_RESOURCE_BUNDLE: Name defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[PropertyDescriptorImpl]

'value' @ [56:61] ==> public open val value: Any? defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[DeserializedPropertyDescriptor]

'annotations' @ [60:13] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedPropertyDescriptor]

'findAnnotation' @ [60:25] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'PROPERTY_KEY' @ [60:40] ==> private val PROPERTY_KEY: FqName defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[PropertyDescriptorImpl]

'annotations' @ [60:57] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedPropertyDescriptor]

'findExternalAnnotation' @ [60:69] ==> public open fun findExternalAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'PROPERTY_KEY' @ [60:92] ==> private val PROPERTY_KEY: FqName defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[PropertyDescriptorImpl]

'getBundleName' @ [60:108] ==> private fun AnnotationDescriptor.getBundleName(): String? defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[SimpleFunctionDescriptorImpl]

'safeDeparenthesize' @ [64:32] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [64:51] ==> <this> defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[ReceiverParameterDescriptorImpl]

'expression' @ [65:18] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'parent' @ [65:29] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [67:6] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'let' @ [67:30] ==> @InlineOnly public inline fun <T, R> KtProperty.let(block: (KtProperty) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty
    <R> -> Nothing

'it' @ [67:43] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [67:46] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getBundleNameByAnnotation' @ [67:74] ==> private fun DeclarationDescriptor.getBundleNameByAnnotation(): String? defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[SimpleFunctionDescriptorImpl]

'expression' @ [69:26] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'analyze' @ [69:37] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [69:61] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'if (parent is KtQualifiedExpression && expression == parent.receiverExpression) {
                parent.selectorExpression.getResolvedCall(bindingContext)
            }
            else {
                expression.getParentResolvedCall(bindingContext)
            }' @ [71:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolvedCall<out CallableDescriptor>?, elseBranch: ResolvedCall<out CallableDescriptor>?): ResolvedCall<out CallableDescriptor>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolvedCall<out CallableDescriptor>?

'parent' @ [71:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'expression' @ [71:52] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'parent' @ [71:66] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'receiverExpression' @ [71:73] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'parent' @ [72:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'selectorExpression' @ [72:24] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'getResolvedCall' @ [72:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [72:59] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'expression' @ [75:17] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'getParentResolvedCall' @ [75:28] ==> public fun KtElement?.getParentResolvedCall(context: BindingContext, strict: Boolean = ...): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [75:50] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'resolvedCall' @ [77:20] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'resultingDescriptor' @ [77:33] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'==' @ [79:9] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtExpression[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [79:10] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'extensionReceiver' @ [79:23] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'expression' @ [79:66] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'expression' @ [79:80] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'callable' @ [80:37] ==> val callable: CallableDescriptor defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'returnType' @ [80:46] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'annotations' @ [80:58] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'Annotations' @ [81:16] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'findUseSiteTargetedAnnotation' @ [82:18] ==> public final fun findUseSiteTargetedAnnotation(annotations: Annotations, target: AnnotationUseSiteTarget, fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedSimpleFunctionDescriptor]

'returnTypeAnnotations' @ [82:48] ==> val returnTypeAnnotations: Annotations defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'RECEIVER' @ [82:95] ==> enum entry RECEIVER defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget[FakeCallableDescriptorForObject]

'PROPERTY_KEY' @ [82:105] ==> private val PROPERTY_KEY: FqName defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[PropertyDescriptorImpl]

'getBundleName' @ [83:19] ==> private fun AnnotationDescriptor.getBundleName(): String? defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [86:12] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'valueArguments' @ [86:25] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'entries' @ [86:40] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'singleOrNull' @ [87:14] ==> public inline fun <T> Iterable<MutableMap.MutableEntry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>>.singleOrNull(predicate: (MutableMap.MutableEntry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>) -> Boolean): MutableMap.MutableEntry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?), (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)>

'it' @ [87:29] ==> value-parameter it: MutableMap.MutableEntry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)> defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [87:32] ==> public abstract val value: (ResolvedValueArgument..ResolvedValueArgument?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'arguments' @ [87:38] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'any' @ [87:48] ==> public inline fun <T> Iterable<(ValueArgument..ValueArgument?)>.any(predicate: ((ValueArgument..ValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'it' @ [87:54] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [87:57] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'expression' @ [87:84] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.properties.getBundleNameByContext[LocalVariableDescriptor]

'key' @ [88:15] ==> public abstract val key: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'getBundleNameByAnnotation' @ [89:15] ==> private fun DeclarationDescriptor.getBundleNameByAnnotation(): String? defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[SimpleFunctionDescriptorImpl]

'getResolvedCall' @ [93:24] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'analyze' @ [93:40] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [93:64] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'?:' @ [94:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor

'resolvedCall' @ [94:18] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.properties.getPropertyKeyResolvedCall[LocalVariableDescriptor]

'resultingDescriptor' @ [94:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'containingDeclaration' @ [94:84] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'klass' @ [95:9] ==> val klass: ClassDescriptor defined in org.jetbrains.kotlin.idea.properties.getPropertyKeyResolvedCall[LocalVariableDescriptor]

'kind' @ [95:15] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ANNOTATION_CLASS' @ [95:33] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'klass' @ [95:53] ==> val klass: ClassDescriptor defined in org.jetbrains.kotlin.idea.properties.getPropertyKeyResolvedCall[LocalVariableDescriptor]

'importableFqName' @ [95:59] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'PROPERTY_KEY' @ [95:79] ==> private val PROPERTY_KEY: FqName defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[PropertyDescriptorImpl]

'resolvedCall' @ [96:12] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.properties.getPropertyKeyResolvedCall[LocalVariableDescriptor]

'safeDeparenthesize' @ [100:28] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [100:47] ==> <this> defined in org.jetbrains.kotlin.idea.properties.isBundleName[ReceiverParameterDescriptorImpl]

'parent' @ [100:53] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
        is KtValueArgument -> {
            val resolvedCall = parent.getStrictParentOfType<KtAnnotationEntry>()?.getPropertyKeyResolvedCall() ?: return false
            val valueParameter = (resolvedCall.getArgumentMapping(parent) as? ArgumentMatch)?.valueParameter ?: return false
            if (valueParameter.name != PROPERTY_KEY_RESOURCE_BUNDLE) return false

            return true
        }

        is KtProperty -> {
            val contexts = (parent.useScope as? LocalSearchScope)?.scope ?: arrayOf(parent.containingFile)
            return contexts.any {
                it.anyDescendantOfType<KtAnnotationEntry> f@ { entry ->
                    if (!entry.valueArguments.any { it.getArgumentName()?.asName == PROPERTY_KEY_RESOURCE_BUNDLE }) return@f false
                    val resolvedCall = entry.getPropertyKeyResolvedCall() ?: return@f false
                    val parameter = resolvedCall.resultingDescriptor.valueParameters.singleOrNull { it.name == PROPERTY_KEY_RESOURCE_BUNDLE }
                                    ?: return@f false
                    val valueArgument = resolvedCall.valueArguments[parameter] as? ExpressionValueArgument ?: return@f false
                    val bundleNameExpression = valueArgument.valueArgument?.getArgumentExpression() ?: return@f false
                    bundleNameExpression is KtSimpleNameExpression && bundleNameExpression.mainReference.resolve() == parent
                }
            }
        }
    }' @ [101:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'parent' @ [101:11] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.properties.isBundleName[LocalVariableDescriptor]

'parent' @ [103:32] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.properties.isBundleName[LocalVariableDescriptor]

'getStrictParentOfType' @ [103:39] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'getPropertyKeyResolvedCall' @ [103:83] ==> private fun KtAnnotationEntry.getPropertyKeyResolvedCall(): ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[SimpleFunctionDescriptorImpl]

'?:' @ [104:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ValueParameterDescriptor?, right: ValueParameterDescriptor): ValueParameterDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ValueParameterDescriptor

'resolvedCall' @ [104:35] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.properties.isBundleName[LocalVariableDescriptor]

'getArgumentMapping' @ [104:48] ==> @NotNull public abstract fun getArgumentMapping(@NotNull p0: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'parent' @ [104:67] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.properties.isBundleName[LocalVariableDescriptor]

'valueParameter' @ [104:95] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'valueParameter' @ [105:17] ==> val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.properties.isBundleName[LocalVariableDescriptor]

'name' @ [105:32] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'PROPERTY_KEY_RESOURCE_BUNDLE' @ [105:40] ==> private val PROPERTY_KEY_RESOURCE_BUNDLE: Name defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[PropertyDescriptorImpl]

'?:' @ [111:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Array<out (PsiElement..PsiElement?)>?, right: Array<out (PsiElement..PsiElement?)>): Array<out (PsiElement..PsiElement?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Array<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'parent' @ [111:29] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.properties.isBundleName[LocalVariableDescriptor]

'useScope' @ [111:36] ==> public final val KtProperty.useScope: SearchScope[MyPropertyDescriptor]

'scope' @ [111:68] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'arrayOf' @ [111:77] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiFile): Array<PsiFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiFile

'parent' @ [111:85] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.properties.isBundleName[LocalVariableDescriptor]

'containingFile' @ [111:92] ==> public final val KtProperty.containingFile: PsiFile[MyPropertyDescriptor]

'contexts' @ [112:20] ==> val contexts: Array<out (PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.properties.isBundleName[LocalVariableDescriptor]

'any' @ [112:29] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.any(predicate: ((PsiElement..PsiElement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [113:17] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.properties.isBundleName.<anonymous>[ValueParameterDescriptorImpl]

'anyDescendantOfType' @ [113:20] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtAnnotationEntry) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'!' @ [114:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'entry' @ [114:26] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.properties.isBundleName.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valueArguments' @ [114:32] ==> public final val KtAnnotationEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'any' @ [114:47] ==> public inline fun <T> Iterable<(ValueArgument..ValueArgument?)>.any(predicate: ((ValueArgument..ValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'it' @ [114:53] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.properties.isBundleName.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [114:56] ==> public abstract fun getArgumentName(): ValueArgumentName? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'asName' @ [114:75] ==> public abstract val asName: Name defined in org.jetbrains.kotlin.psi.ValueArgumentName[DeserializedPropertyDescriptor]

'PROPERTY_KEY_RESOURCE_BUNDLE' @ [114:85] ==> private val PROPERTY_KEY_RESOURCE_BUNDLE: Name defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[PropertyDescriptorImpl]

'entry' @ [115:40] ==> value-parameter entry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.properties.isBundleName.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getPropertyKeyResolvedCall' @ [115:46] ==> private fun KtAnnotationEntry.getPropertyKeyResolvedCall(): ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [116:37] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.properties.isBundleName.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resultingDescriptor' @ [116:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'valueParameters' @ [116:70] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'singleOrNull' @ [116:86] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.singleOrNull(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [116:101] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.properties.isBundleName.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [116:104] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'PROPERTY_KEY_RESOURCE_BUNDLE' @ [116:112] ==> private val PROPERTY_KEY_RESOURCE_BUNDLE: Name defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[PropertyDescriptorImpl]

'resolvedCall' @ [118:41] ==> val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.properties.isBundleName.<anonymous>.<anonymous>[LocalVariableDescriptor]

'valueArguments' @ [118:54] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'parameter' @ [118:69] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.properties.isBundleName.<anonymous>.<anonymous>[LocalVariableDescriptor]

'valueArgument' @ [119:48] ==> val valueArgument: ExpressionValueArgument defined in org.jetbrains.kotlin.idea.properties.isBundleName.<anonymous>.<anonymous>[LocalVariableDescriptor]

'valueArgument' @ [119:62] ==> public final val ExpressionValueArgument.valueArgument: ValueArgument?[MyPropertyDescriptor]

'getArgumentExpression' @ [119:77] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'bundleNameExpression' @ [120:21] ==> val bundleNameExpression: KtExpression defined in org.jetbrains.kotlin.idea.properties.isBundleName.<anonymous>.<anonymous>[LocalVariableDescriptor]

'bundleNameExpression' @ [120:71] ==> val bundleNameExpression: KtExpression defined in org.jetbrains.kotlin.idea.properties.isBundleName.<anonymous>.<anonymous>[LocalVariableDescriptor]

'mainReference' @ [120:92] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [120:106] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'parent' @ [120:119] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.properties.isBundleName[LocalVariableDescriptor]

'PsiReferenceProvider' @ [129:45] ==> public constructor PsiReferenceProvider() defined in com.intellij.psi.PsiReferenceProvider[JavaClassConstructorDescriptor]

'!' @ [131:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [131:15] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.properties.KotlinPropertyKeyReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'element' @ [131:56] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.properties.KotlinPropertyKeyReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'isPlain' @ [131:64] ==> public fun KtStringTemplateExpression.isPlain(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'EMPTY_ARRAY' @ [131:96] ==> public final val EMPTY_ARRAY: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>?) defined in com.intellij.psi.PsiReference[JavaPropertyDescriptor]

'element' @ [132:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.properties.KotlinPropertyKeyReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'getBundleNameByContext' @ [132:34] ==> private fun KtExpression.getBundleNameByContext(): String? defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[SimpleFunctionDescriptorImpl]

'EMPTY_ARRAY' @ [132:82] ==> public final val EMPTY_ARRAY: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>?) defined in com.intellij.psi.PsiReference[JavaPropertyDescriptor]

'arrayOf' @ [133:16] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PropertyReference): Array<PropertyReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PropertyReference

'PropertyReference' @ [133:24] ==> public constructor PropertyReference(@NotNull p0: String, @NotNull p1: PsiElement, @Nullable p2: String?, p3: Boolean) defined in com.intellij.lang.properties.references.PropertyReference[JavaClassConstructorDescriptor]

'getValueText' @ [133:62] ==> @NotNull public open fun getValueText(@NotNull p0: PsiElement): String defined in com.intellij.psi.ElementManipulators[JavaMethodDescriptor]

'element' @ [133:75] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.properties.KotlinPropertyKeyReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'element' @ [133:85] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.properties.KotlinPropertyKeyReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'bundleName' @ [133:94] ==> val bundleName: String defined in org.jetbrains.kotlin.idea.properties.KotlinPropertyKeyReferenceProvider.getReferencesByElement[LocalVariableDescriptor]

'PsiReferenceProvider' @ [137:52] ==> public constructor PsiReferenceProvider() defined in com.intellij.psi.PsiReferenceProvider[JavaClassConstructorDescriptor]

'!' @ [139:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [139:15] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.properties.KotlinResourceBundleNameReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'element' @ [139:56] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.properties.KotlinResourceBundleNameReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'isPlain' @ [139:64] ==> public fun KtStringTemplateExpression.isPlain(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [139:77] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.properties.KotlinResourceBundleNameReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

'isBundleName' @ [139:85] ==> private fun KtStringTemplateExpression.isBundleName(): Boolean defined in org.jetbrains.kotlin.idea.properties in file referenceProviders.kt[SimpleFunctionDescriptorImpl]

'EMPTY_ARRAY' @ [139:122] ==> public final val EMPTY_ARRAY: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>?) defined in com.intellij.psi.PsiReference[JavaPropertyDescriptor]

'arrayOf' @ [140:16] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ResourceBundleReference): Array<ResourceBundleReference> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ResourceBundleReference

'ResourceBundleReference' @ [140:24] ==> public constructor ResourceBundleReference(p0: (PsiElement..PsiElement?)) defined in com.intellij.lang.properties.ResourceBundleReference[JavaClassConstructorDescriptor]

'element' @ [140:48] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.properties.KotlinResourceBundleNameReferenceProvider.getReferencesByElement[ValueParameterDescriptorImpl]

