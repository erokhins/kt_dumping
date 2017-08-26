'AbstractTranslator' @ [40:5] ==> protected/*protected and package*/ constructor AbstractTranslator(@NotNull context: TranslationContext) defined in org.jetbrains.kotlin.js.translate.general.AbstractTranslator[JavaClassConstructorDescriptor]

'context' @ [40:24] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[ValueParameterDescriptorImpl]

'getClassDescriptor' @ [43:26] ==> @NotNull public open fun getClassDescriptor(@NotNull context: BindingContext, @NotNull declaration: KtClassOrObject): ClassDescriptor defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [43:45] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[ValueParameterDescriptorImpl]

'bindingContext' @ [43:53] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'classDeclaration' @ [43:71] ==> value-parameter classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[ValueParameterDescriptorImpl]

'classDeclaration' @ [46:13] ==> value-parameter classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [46:30] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'filterIsInstance' @ [46:51] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtDelegatedSuperTypeEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtDelegatedSuperTypeEntry

'mutableMapOf' @ [49:26] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<KtDelegatedSuperTypeEntry, DelegationTranslator.Field> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtDelegatedSuperTypeEntry
    <V> -> Field

'delegationBySpecifiers' @ [52:27] ==> private final val delegationBySpecifiers: List<KtDelegatedSuperTypeEntry> defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'specifier' @ [53:30] ==> val specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'delegateExpression' @ [53:40] ==> public final val KtDelegatedSuperTypeEntry.delegateExpression: KtExpression?[MyPropertyDescriptor]

'IllegalArgumentException' @ [54:36] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'specifier' @ [54:104] ==> val specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'text' @ [54:114] ==> public final val KtDelegatedSuperTypeEntry.text: (String..String?)[MyPropertyDescriptor]

'CodegenUtil' @ [55:38] ==> public object CodegenUtil defined in org.jetbrains.kotlin.backend.common[FakeCallableDescriptorForObject]

'getDelegatePropertyIfAny' @ [55:50] ==> @JvmStatic public final fun getDelegatePropertyIfAny(expression: KtExpression, classDescriptor: ClassDescriptor, bindingContext: BindingContext): PropertyDescriptor? defined in org.jetbrains.kotlin.backend.common.CodegenUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [55:75] ==> val expression: KtExpression defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'classDescriptor' @ [55:87] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'bindingContext' @ [55:104] ==> @NotNull protected/*protected and package*/ open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'if (CodegenUtil.isFinalPropertyWithBackingField(propertyDescriptor, bindingContext())) {
                val delegateName = context.getNameForDescriptor(propertyDescriptor!!)
                fields[specifier] = Field(delegateName, false)
            }
            else {
                val classFqName = DescriptorUtils.getFqName(classDescriptor)
                val idForMangling = classFqName.asString()
                val suggestedName = NameSuggestion.getStableMangledName(Namer.getDelegatePrefix(), idForMangling)
                val delegateName = context.getScopeForDescriptor(classDescriptor).declareFreshName("${suggestedName}_0")
                fields[specifier] = Field(delegateName, true)
            }' @ [57:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'CodegenUtil' @ [57:17] ==> public object CodegenUtil defined in org.jetbrains.kotlin.backend.common[FakeCallableDescriptorForObject]

'isFinalPropertyWithBackingField' @ [57:29] ==> @JvmStatic public final fun isFinalPropertyWithBackingField(propertyDescriptor: PropertyDescriptor?, bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.backend.common.CodegenUtil[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [57:61] ==> val propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'bindingContext' @ [57:81] ==> @NotNull protected/*protected and package*/ open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'context' @ [58:36] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[ValueParameterDescriptorImpl]

'getNameForDescriptor' @ [58:44] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'propertyDescriptor' @ [58:65] ==> val propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'fields' @ [59:17] ==> private final val fields: MutableMap<KtDelegatedSuperTypeEntry, DelegationTranslator.Field> defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'specifier' @ [59:24] ==> val specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'Field' @ [59:37] ==> public constructor Field(name: JsName, generateField: Boolean) defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.Field[ClassConstructorDescriptorImpl]

'delegateName' @ [59:43] ==> val delegateName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'getFqName' @ [62:51] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [62:61] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'classFqName' @ [63:37] ==> val classFqName: FqNameUnsafe defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'asString' @ [63:49] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'NameSuggestion' @ [64:37] ==> public companion object defined in org.jetbrains.kotlin.js.naming.NameSuggestion[FakeCallableDescriptorForObject]

'getStableMangledName' @ [64:52] ==> @JvmStatic public final fun getStableMangledName(suggestedName: String, forCalculateId: String): String defined in org.jetbrains.kotlin.js.naming.NameSuggestion.Companion[DeserializedSimpleFunctionDescriptor]

'getDelegatePrefix' @ [64:79] ==> @NotNull public open fun getDelegatePrefix(): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'idForMangling' @ [64:100] ==> val idForMangling: String defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'context' @ [65:36] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[ValueParameterDescriptorImpl]

'getScopeForDescriptor' @ [65:44] ==> @NotNull public open fun getScopeForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsScope defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'classDescriptor' @ [65:66] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'declareFreshName' @ [65:83] ==> @NotNull public open fun declareFreshName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'suggestedName' @ [65:103] ==> val suggestedName: String defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'fields' @ [66:17] ==> private final val fields: MutableMap<KtDelegatedSuperTypeEntry, DelegationTranslator.Field> defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'specifier' @ [66:24] ==> val specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'Field' @ [66:37] ==> public constructor Field(name: JsName, generateField: Boolean) defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.Field[ClassConstructorDescriptorImpl]

'delegateName' @ [66:43] ==> val delegateName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.<init>[LocalVariableDescriptor]

'delegationBySpecifiers' @ [72:27] ==> private final val delegationBySpecifiers: List<KtDelegatedSuperTypeEntry> defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'fields' @ [73:25] ==> private final val fields: MutableMap<KtDelegatedSuperTypeEntry, DelegationTranslator.Field> defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'specifier' @ [73:32] ==> val specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[LocalVariableDescriptor]

'field' @ [74:17] ==> val field: DelegationTranslator.Field defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[LocalVariableDescriptor]

'generateField' @ [74:23] ==> public final val generateField: Boolean defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.Field[PropertyDescriptorImpl]

'specifier' @ [75:34] ==> val specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[LocalVariableDescriptor]

'delegateExpression' @ [75:44] ==> public final val KtDelegatedSuperTypeEntry.delegateExpression: KtExpression?[MyPropertyDescriptor]

'context' @ [76:31] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'innerBlock' @ [76:41] ==> @NotNull public open fun innerBlock(): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'translateAsExpression' @ [77:52] ==> @NotNull public open fun translateAsExpression(@NotNull expression: KtExpression, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.general.Translation[JavaMethodDescriptor]

'expression' @ [77:74] ==> val expression: KtExpression defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[LocalVariableDescriptor]

'context' @ [77:86] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[LocalVariableDescriptor]

'statements' @ [78:17] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[ValueParameterDescriptorImpl]

'context' @ [78:31] ==> val context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[LocalVariableDescriptor]

'dynamicContext' @ [78:39] ==> @NotNull public open fun dynamicContext(): DynamicContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'jsBlock' @ [78:56] ==> @NotNull public open fun jsBlock(): JsBlock defined in org.jetbrains.kotlin.js.translate.context.DynamicContext[JavaMethodDescriptor]

'statements' @ [78:66] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'pureFqn' @ [79:38] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'field' @ [79:46] ==> val field: DelegationTranslator.Field defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[LocalVariableDescriptor]

'name' @ [79:52] ==> public final val name: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.Field[PropertyDescriptorImpl]

'JsThisRef' @ [79:58] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'statements' @ [80:17] ==> value-parameter statements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[ValueParameterDescriptorImpl]

'assignment' @ [80:42] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'lhs' @ [80:53] ==> val lhs: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[LocalVariableDescriptor]

'delegateInitExpr' @ [80:58] ==> val delegateInitExpr: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[LocalVariableDescriptor]

'apply' @ [81:26] ==> @InlineOnly public inline fun <T> JsBinaryOperation.apply(block: (JsBinaryOperation).() -> Unit): JsBinaryOperation defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsBinaryOperation

'source' @ [81:34] ==> public final var JsBinaryOperation.source: (Any..Any?)[MyPropertyDescriptor]

'specifier' @ [81:43] ==> val specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.addInitCode[LocalVariableDescriptor]

'makeStmt' @ [82:26] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'delegationBySpecifiers' @ [88:27] ==> private final val delegationBySpecifiers: List<KtDelegatedSuperTypeEntry> defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'getSuperClass' @ [89:13] ==> private final fun getSuperClass(specifier: KtSuperTypeListEntry): ClassDescriptor? defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[SimpleFunctionDescriptorImpl]

'specifier' @ [89:27] ==> val specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegated[LocalVariableDescriptor]

'let' @ [89:39] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> Unit

'generateDelegates' @ [90:17] ==> private final fun generateDelegates(specifier: KtSuperTypeListEntry, toClass: ClassDescriptor, field: DelegationTranslator.Field): Unit defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[SimpleFunctionDescriptorImpl]

'specifier' @ [90:35] ==> val specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegated[LocalVariableDescriptor]

'it' @ [90:46] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegated.<anonymous>[ValueParameterDescriptorImpl]

'fields' @ [90:50] ==> private final val fields: MutableMap<KtDelegatedSuperTypeEntry, DelegationTranslator.Field> defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'specifier' @ [90:57] ==> val specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegated[LocalVariableDescriptor]

'?:' @ [96:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor?

'getSuperClassBySuperTypeListEntry' @ [96:25] ==> @JvmStatic public final fun getSuperClassBySuperTypeListEntry(specifier: KtSuperTypeListEntry, bindingContext: BindingContext): ClassDescriptor? defined in org.jetbrains.kotlin.backend.common.CodegenUtil[DeserializedSimpleFunctionDescriptor]

'specifier' @ [96:59] ==> value-parameter specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.getSuperClass[ValueParameterDescriptorImpl]

'bindingContext' @ [96:70] ==> @NotNull protected/*protected and package*/ open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'error' @ [97:16] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'specifier' @ [97:74] ==> value-parameter specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.getSuperClass[ValueParameterDescriptorImpl]

'text' @ [97:84] ==> public final val KtSuperTypeListEntry.text: (String..String?)[MyPropertyDescriptor]

'component1' @ [100:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<CallableMemberDescriptor, CallableMemberDescriptor>.component1(): CallableMemberDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CallableMemberDescriptor
    <V> -> CallableMemberDescriptor

'component2' @ [100:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<CallableMemberDescriptor, CallableMemberDescriptor>.component2(): CallableMemberDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CallableMemberDescriptor
    <V> -> CallableMemberDescriptor

'DelegationResolver' @ [100:52] ==> public companion object defined in org.jetbrains.kotlin.resolve.DelegationResolver[FakeCallableDescriptorForObject]

'getDelegates' @ [100:71] ==> public final fun getDelegates(descriptor: ClassDescriptor, toInterface: ClassDescriptor, delegateExpressionType: KotlinType? = ...): Map<CallableMemberDescriptor, CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [100:84] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'toClass' @ [100:101] ==> value-parameter toClass: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegates[ValueParameterDescriptorImpl]

'when (descriptor) {
                is PropertyDescriptor ->
                    generateDelegateCallForPropertyMember(specifier, descriptor, field.name)
                is FunctionDescriptor ->
                    generateDelegateCallForFunctionMember(specifier, descriptor, overriddenDescriptor as FunctionDescriptor, field.name)
                else ->
                    throw IllegalArgumentException("Expected property or function $descriptor")
            }' @ [101:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'descriptor' @ [101:19] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegates[LocalVariableDescriptor]

'generateDelegateCallForPropertyMember' @ [103:21] ==> private final fun generateDelegateCallForPropertyMember(specifier: KtSuperTypeListEntry, descriptor: PropertyDescriptor, delegateName: JsName): Unit defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[SimpleFunctionDescriptorImpl]

'specifier' @ [103:59] ==> value-parameter specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegates[ValueParameterDescriptorImpl]

'descriptor' @ [103:70] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegates[LocalVariableDescriptor]

'field' @ [103:82] ==> value-parameter field: DelegationTranslator.Field defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegates[ValueParameterDescriptorImpl]

'name' @ [103:88] ==> public final val name: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.Field[PropertyDescriptorImpl]

'generateDelegateCallForFunctionMember' @ [105:21] ==> private final fun generateDelegateCallForFunctionMember(specifier: KtSuperTypeListEntry, descriptor: FunctionDescriptor, overriddenDescriptor: FunctionDescriptor, delegateName: JsName): Unit defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[SimpleFunctionDescriptorImpl]

'specifier' @ [105:59] ==> value-parameter specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegates[ValueParameterDescriptorImpl]

'descriptor' @ [105:70] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegates[LocalVariableDescriptor]

'overriddenDescriptor' @ [105:82] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegates[LocalVariableDescriptor]

'field' @ [105:126] ==> value-parameter field: DelegationTranslator.Field defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegates[ValueParameterDescriptorImpl]

'name' @ [105:132] ==> public final val name: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.Field[PropertyDescriptorImpl]

'IllegalArgumentException' @ [107:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [107:84] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegates[LocalVariableDescriptor]

'descriptor' @ [117:36] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'name' @ [117:47] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [117:52] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'JsNameRef' @ [120:31] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'delegateName' @ [120:41] ==> value-parameter delegateName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'JsThisRef' @ [120:55] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'if (DescriptorUtils.isExtension(descriptor)) {
                val getterName = context().getNameForDescriptor(getterDescriptor)
                val receiver = Namer.getReceiverParameterName()
                JsInvocation(JsNameRef(getterName, delegateRef), JsNameRef(receiver))
            }
            else {
                JsNameRef(propertyName, delegateRef)
            }' @ [122:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'isExtension' @ [122:70] ==> public open fun isExtension(@NotNull p0: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [122:82] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'context' @ [123:34] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'getNameForDescriptor' @ [123:44] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getterDescriptor' @ [123:65] ==> value-parameter getterDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[ValueParameterDescriptorImpl]

'getReceiverParameterName' @ [124:38] ==> @NotNull public open fun getReceiverParameterName(): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'JsInvocation' @ [125:17] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'JsNameRef' @ [125:30] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'getterName' @ [125:40] ==> val getterName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[LocalVariableDescriptor]

'delegateRef' @ [125:52] ==> val delegateRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[LocalVariableDescriptor]

'JsNameRef' @ [125:66] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'receiver' @ [125:76] ==> val receiver: String defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[LocalVariableDescriptor]

'JsNameRef' @ [128:17] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'propertyName' @ [128:27] ==> val propertyName: String defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[LocalVariableDescriptor]

'delegateRef' @ [128:41] ==> val delegateRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[LocalVariableDescriptor]

'returnExpression' @ [131:13] ==> val returnExpression: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[LocalVariableDescriptor]

'source' @ [131:30] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'specifier' @ [131:37] ==> value-parameter specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'simpleReturnFunction' @ [133:30] ==> @NotNull public open fun simpleReturnFunction(@NotNull functionScope: JsScope, @NotNull returnExpression: JsExpression): JsFunction defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'context' @ [133:51] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'getScopeForDescriptor' @ [133:61] ==> @NotNull public open fun getScopeForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsScope defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getterDescriptor' @ [133:83] ==> value-parameter getterDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[ValueParameterDescriptorImpl]

'containingDeclaration' @ [133:100] ==> public final val PropertyGetterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'returnExpression' @ [133:124] ==> val returnExpression: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[LocalVariableDescriptor]

'jsFunction' @ [134:13] ==> val jsFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[LocalVariableDescriptor]

'source' @ [134:24] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'specifier' @ [134:33] ==> value-parameter specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'isExtension' @ [135:33] ==> public open fun isExtension(@NotNull p0: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [135:45] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'jsFunction' @ [136:36] ==> val jsFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[LocalVariableDescriptor]

'scope' @ [136:47] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'declareName' @ [136:53] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[JavaMethodDescriptor]

'getReceiverParameterName' @ [136:71] ==> @NotNull public open fun getReceiverParameterName(): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'jsFunction' @ [137:17] ==> val jsFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[LocalVariableDescriptor]

'parameters' @ [137:28] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'add' @ [137:39] ==> public abstract fun add(element: (JsParameter..JsParameter?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'JsParameter' @ [137:43] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'receiverName' @ [137:55] ==> val receiverName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[LocalVariableDescriptor]

'jsFunction' @ [139:20] ==> val jsFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetterFunction[LocalVariableDescriptor]

'JsFunction' @ [143:30] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'context' @ [143:41] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'program' @ [143:51] ==> @NotNull public open fun program(): JsProgram defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'rootScope' @ [143:61] ==> public final val JsProgram.rootScope: (JsRootScope..JsRootScope?)[MyPropertyDescriptor]

'+' @ [144:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'setterDescriptor' @ [144:57] ==> value-parameter setterDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[ValueParameterDescriptorImpl]

'name' @ [144:74] ==> public final val PropertySetterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [144:79] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'jsFunction' @ [145:13] ==> val jsFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'source' @ [145:24] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'specifier' @ [145:33] ==> value-parameter specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'assert' @ [147:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'setterDescriptor' @ [147:20] ==> value-parameter setterDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[ValueParameterDescriptorImpl]

'valueParameters' @ [147:37] ==> public final val PropertySetterDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [147:53] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'JsParameter' @ [148:36] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'declareTemporary' @ [148:56] ==> @NotNull public open fun declareTemporary(): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'defaultParameter' @ [149:39] ==> val defaultParameter: JsParameter defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'name' @ [149:56] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'makeRef' @ [149:61] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsNameRef' @ [151:31] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'delegateName' @ [151:41] ==> value-parameter delegateName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'JsThisRef' @ [151:55] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'if (DescriptorUtils.isExtension(descriptor)) {
                val setterName = context().getNameForDescriptor(setterDescriptor)
                val setterNameRef = JsNameRef(setterName, delegateRef)
                val extensionFunctionReceiverName = jsFunction.scope.declareName(Namer.getReceiverParameterName())
                jsFunction.parameters.add(JsParameter(extensionFunctionReceiverName))
                JsInvocation(setterNameRef, JsNameRef(extensionFunctionReceiverName), defaultParameterRef)
            }
            else {
                val propertyNameRef = JsNameRef(propertyName, delegateRef)
                JsAstUtils.assignment(propertyNameRef, defaultParameterRef)
            }' @ [154:47] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'isExtension' @ [154:67] ==> public open fun isExtension(@NotNull p0: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [154:79] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'context' @ [155:34] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'getNameForDescriptor' @ [155:44] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'setterDescriptor' @ [155:65] ==> value-parameter setterDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[ValueParameterDescriptorImpl]

'JsNameRef' @ [156:37] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'setterName' @ [156:47] ==> val setterName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'delegateRef' @ [156:59] ==> val delegateRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'jsFunction' @ [157:53] ==> val jsFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'scope' @ [157:64] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'declareName' @ [157:70] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[JavaMethodDescriptor]

'getReceiverParameterName' @ [157:88] ==> @NotNull public open fun getReceiverParameterName(): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'jsFunction' @ [158:17] ==> val jsFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'parameters' @ [158:28] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'add' @ [158:39] ==> public abstract fun add(element: (JsParameter..JsParameter?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'JsParameter' @ [158:43] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'extensionFunctionReceiverName' @ [158:55] ==> val extensionFunctionReceiverName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'JsInvocation' @ [159:17] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'setterNameRef' @ [159:30] ==> val setterNameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'JsNameRef' @ [159:45] ==> public constructor JsNameRef(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'extensionFunctionReceiverName' @ [159:55] ==> val extensionFunctionReceiverName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'defaultParameterRef' @ [159:87] ==> val defaultParameterRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'JsNameRef' @ [162:39] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'propertyName' @ [162:49] ==> val propertyName: String defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[LocalVariableDescriptor]

'delegateRef' @ [162:63] ==> val delegateRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'assignment' @ [163:28] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'propertyNameRef' @ [163:39] ==> val propertyNameRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'defaultParameterRef' @ [163:56] ==> val defaultParameterRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'jsFunction' @ [166:13] ==> val jsFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'parameters' @ [166:24] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'add' @ [166:35] ==> public abstract fun add(element: (JsParameter..JsParameter?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'defaultParameter' @ [166:39] ==> val defaultParameter: JsParameter defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'jsFunction' @ [167:13] ==> val jsFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'body' @ [167:24] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'JsBlock' @ [167:31] ==> public constructor JsBlock(p0: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'setExpression' @ [167:39] ==> val setExpression: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'apply' @ [167:53] ==> @InlineOnly public inline fun <T> JsExpression.apply(block: JsExpression.() -> Unit): JsExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'source' @ [167:61] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'specifier' @ [167:70] ==> value-parameter specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'makeStmt' @ [167:82] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'jsFunction' @ [168:20] ==> val jsFunction: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetterFunction[LocalVariableDescriptor]

'translateFunctionAsEcma5PropertyDescriptor' @ [172:17] ==> @NotNull public open fun translateFunctionAsEcma5PropertyDescriptor(@NotNull function: JsFunction, @NotNull descriptor: FunctionDescriptor, @NotNull context: TranslationContext): JsPropertyInitializer defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'function' @ [172:60] ==> value-parameter function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateAccessor[ValueParameterDescriptorImpl]

'accessorDescriptor' @ [172:70] ==> value-parameter accessorDescriptor: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateAccessor[ValueParameterDescriptorImpl]

'context' @ [172:90] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'descriptor' @ [175:36] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'getter' @ [175:47] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'IllegalStateException' @ [175:63] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'generateDelegateAccessor' @ [176:20] ==> local final fun generateDelegateAccessor(accessorDescriptor: PropertyAccessorDescriptor, function: JsFunction): JsPropertyInitializer defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[SimpleFunctionDescriptorImpl]

'getterDescriptor' @ [176:45] ==> val getterDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetter[LocalVariableDescriptor]

'generateDelegateGetterFunction' @ [176:63] ==> local final fun generateDelegateGetterFunction(getterDescriptor: PropertyGetterDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[SimpleFunctionDescriptorImpl]

'getterDescriptor' @ [176:94] ==> val getterDescriptor: PropertyGetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateGetter[LocalVariableDescriptor]

'descriptor' @ [180:36] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'setter' @ [180:47] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'IllegalStateException' @ [180:63] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'generateDelegateAccessor' @ [181:20] ==> local final fun generateDelegateAccessor(accessorDescriptor: PropertyAccessorDescriptor, function: JsFunction): JsPropertyInitializer defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[SimpleFunctionDescriptorImpl]

'setterDescriptor' @ [181:45] ==> val setterDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetter[LocalVariableDescriptor]

'generateDelegateSetterFunction' @ [181:63] ==> local final fun generateDelegateSetterFunction(setterDescriptor: PropertySetterDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[SimpleFunctionDescriptorImpl]

'setterDescriptor' @ [181:94] ==> val setterDescriptor: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember.generateDelegateSetter[LocalVariableDescriptor]

'if (descriptor.isExtensionProperty || TranslationUtils.shouldAccessViaFunctions(descriptor)) {
            val getter = descriptor.getter!!
            context().addDeclarationStatement(context().addFunctionToPrototype(
                    classDescriptor, getter, generateDelegateGetterFunction(getter)))
            if (descriptor.isVar) {
                val setter = descriptor.setter!!
                context().addDeclarationStatement(
                        context().addFunctionToPrototype(classDescriptor, setter, generateDelegateSetterFunction(setter)))
            }
        }
        else {
            val literal = JsObjectLiteral(true)
            literal.propertyInitializers.addGetterAndSetter(descriptor, ::generateDelegateGetter, ::generateDelegateSetter)
            context().addAccessorsToPrototype(classDescriptor, descriptor, literal)
        }' @ [185:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [185:13] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'isExtensionProperty' @ [185:24] ==> public val DeclarationDescriptor.isExtensionProperty: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'shouldAccessViaFunctions' @ [185:64] ==> public open fun shouldAccessViaFunctions(@NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'descriptor' @ [185:89] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'descriptor' @ [186:26] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'getter' @ [186:37] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'context' @ [187:13] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'addDeclarationStatement' @ [187:23] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'context' @ [187:47] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'addFunctionToPrototype' @ [187:57] ==> public fun TranslationContext.addFunctionToPrototype(classDescriptor: ClassDescriptor, descriptor: FunctionDescriptor, function: JsExpression): JsStatement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [188:21] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'getter' @ [188:38] ==> val getter: PropertyGetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[LocalVariableDescriptor]

'generateDelegateGetterFunction' @ [188:46] ==> local final fun generateDelegateGetterFunction(getterDescriptor: PropertyGetterDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[SimpleFunctionDescriptorImpl]

'getter' @ [188:77] ==> val getter: PropertyGetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[LocalVariableDescriptor]

'descriptor' @ [189:17] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'isVar' @ [189:28] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'descriptor' @ [190:30] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'setter' @ [190:41] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'context' @ [191:17] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'addDeclarationStatement' @ [191:27] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'context' @ [192:25] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'addFunctionToPrototype' @ [192:35] ==> public fun TranslationContext.addFunctionToPrototype(classDescriptor: ClassDescriptor, descriptor: FunctionDescriptor, function: JsExpression): JsStatement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [192:58] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'setter' @ [192:75] ==> val setter: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[LocalVariableDescriptor]

'generateDelegateSetterFunction' @ [192:83] ==> local final fun generateDelegateSetterFunction(setterDescriptor: PropertySetterDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[SimpleFunctionDescriptorImpl]

'setter' @ [192:114] ==> val setter: PropertySetterDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[LocalVariableDescriptor]

'JsObjectLiteral' @ [196:27] ==> public constructor JsObjectLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsObjectLiteral[JavaClassConstructorDescriptor]

'literal' @ [197:13] ==> val literal: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[LocalVariableDescriptor]

'propertyInitializers' @ [197:21] ==> public final val JsObjectLiteral.propertyInitializers: (MutableList<(JsPropertyInitializer..JsPropertyInitializer?)>..List<(JsPropertyInitializer..JsPropertyInitializer?)>?)[MyPropertyDescriptor]

'addGetterAndSetter' @ [197:42] ==> public fun MutableList<JsPropertyInitializer>.addGetterAndSetter(descriptor: VariableDescriptorWithAccessors, generateGetter: () -> JsPropertyInitializer, generateSetter: () -> JsPropertyInitializer): Unit defined in org.jetbrains.kotlin.js.translate.declaration in file PropertyTranslator.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [197:61] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'generateDelegateGetter' @ [197:75] ==> local final fun generateDelegateGetter(): JsPropertyInitializer defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[SimpleFunctionDescriptorImpl]

'generateDelegateSetter' @ [197:101] ==> local final fun generateDelegateSetter(): JsPropertyInitializer defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[SimpleFunctionDescriptorImpl]

'context' @ [198:13] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'addAccessorsToPrototype' @ [198:23] ==> public fun TranslationContext.addAccessorsToPrototype(containingClass: ClassDescriptor, propertyDescriptor: PropertyDescriptor, literal: JsObjectLiteral): Unit defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [198:47] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'descriptor' @ [198:64] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[ValueParameterDescriptorImpl]

'literal' @ [198:76] ==> val literal: JsObjectLiteral defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForPropertyMember[LocalVariableDescriptor]

'JsNameRef' @ [209:27] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'delegateName' @ [209:37] ==> value-parameter delegateName: JsName defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForFunctionMember[ValueParameterDescriptorImpl]

'JsThisRef' @ [209:51] ==> public constructor JsThisRef() defined in org.jetbrains.kotlin.js.backend.ast.JsThisRef[JavaClassConstructorDescriptor]

'generateDelegateCall' @ [210:25] ==> public fun generateDelegateCall(classDescriptor: ClassDescriptor, fromDescriptor: FunctionDescriptor, toDescriptor: FunctionDescriptor, thisObject: JsExpression, context: TranslationContext, detectDefaultParameters: Boolean, source: PsiElement?): JsStatement defined in org.jetbrains.kotlin.js.translate.utils in file utils.kt[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [210:46] ==> private final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[PropertyDescriptorImpl]

'descriptor' @ [210:63] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForFunctionMember[ValueParameterDescriptorImpl]

'overriddenDescriptor' @ [210:75] ==> value-parameter overriddenDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForFunctionMember[ValueParameterDescriptorImpl]

'delegateRef' @ [210:97] ==> val delegateRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForFunctionMember[LocalVariableDescriptor]

'context' @ [210:110] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'specifier' @ [210:127] ==> value-parameter specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForFunctionMember[ValueParameterDescriptorImpl]

'context' @ [211:9] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator[JavaMethodDescriptor]

'addDeclarationStatement' @ [211:19] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'statement' @ [211:43] ==> val statement: JsStatement defined in org.jetbrains.kotlin.js.translate.declaration.DelegationTranslator.generateDelegateCallForFunctionMember[LocalVariableDescriptor]

