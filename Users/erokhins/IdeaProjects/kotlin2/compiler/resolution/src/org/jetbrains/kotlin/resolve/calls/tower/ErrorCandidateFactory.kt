'' @ [29:28] ==> private constructor WrongResolutionToClassifier(message: (Name) -> String) defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[ClassConstructorDescriptorImpl]

'it' @ [29:48] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier.TYPE_PARAMETER_AS_VALUE.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [30:31] ==> private constructor WrongResolutionToClassifier(message: (Name) -> String) defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[ClassConstructorDescriptorImpl]

'it' @ [30:51] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier.TYPE_PARAMETER_AS_FUNCTION.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [31:23] ==> private constructor WrongResolutionToClassifier(message: (Name) -> String) defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[ClassConstructorDescriptorImpl]

'it' @ [31:38] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier.INTERFACE_AS_VALUE.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [32:26] ==> private constructor WrongResolutionToClassifier(message: (Name) -> String) defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[ClassConstructorDescriptorImpl]

'it' @ [32:41] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier.INTERFACE_AS_FUNCTION.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [33:19] ==> private constructor WrongResolutionToClassifier(message: (Name) -> String) defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[ClassConstructorDescriptorImpl]

'it' @ [33:30] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier.CLASS_AS_VALUE.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [34:40] ==> private constructor WrongResolutionToClassifier(message: (Name) -> String) defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[ClassConstructorDescriptorImpl]

'it' @ [34:72] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier.INNER_CLASS_CONSTRUCTOR_NO_RECEIVER.<init>.<anonymous>[ValueParameterDescriptorImpl]

'' @ [35:23] ==> private constructor WrongResolutionToClassifier(message: (Name) -> String) defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[ClassConstructorDescriptorImpl]

'it' @ [35:71] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier.OBJECT_AS_FUNCTION.<init>.<anonymous>[ValueParameterDescriptorImpl]

'ErrorCandidate<ClassifierDescriptor>' @ [42:9] ==> private constructor ErrorCandidate<out D : DeclarationDescriptor>(descriptor: ClassifierDescriptor) defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidate[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> ClassifierDescriptor

'classifierDescriptor' @ [42:46] ==> value-parameter classifierDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidate.Classifier.<init>[ValueParameterDescriptorImpl]

'kind' @ [43:28] ==> public final val kind: WrongResolutionToClassifier defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidate.Classifier[PropertyDescriptorImpl]

'invoke' @ [43:33] ==> public abstract operator fun invoke(p1: Name): String defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [43:41] ==> public final val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidate.Classifier[PropertyDescriptorImpl]

'name' @ [43:52] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'ErrorCandidateContext' @ [52:19] ==> public constructor ErrorCandidateContext(scopeTower: ImplicitScopeTower, name: Name, explicitReceiver: DetailedReceiver?) defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[ClassConstructorDescriptorImpl]

'scopeTower' @ [52:41] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.collectErrorCandidatesForFunction[ValueParameterDescriptorImpl]

'name' @ [52:53] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.collectErrorCandidatesForFunction[ValueParameterDescriptorImpl]

'explicitReceiver' @ [52:59] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.collectErrorCandidatesForFunction[ValueParameterDescriptorImpl]

'context' @ [53:5] ==> val context: ErrorCandidateContext defined in org.jetbrains.kotlin.resolve.calls.tower.collectErrorCandidatesForFunction[LocalVariableDescriptor]

'asClassifierCall' @ [53:13] ==> private fun ErrorCandidateContext.asClassifierCall(asFunction: Boolean): Unit defined in org.jetbrains.kotlin.resolve.calls.tower in file ErrorCandidateFactory.kt[SimpleFunctionDescriptorImpl]

'context' @ [54:12] ==> val context: ErrorCandidateContext defined in org.jetbrains.kotlin.resolve.calls.tower.collectErrorCandidatesForFunction[LocalVariableDescriptor]

'result' @ [54:20] ==> public final val result: SmartList<ErrorCandidate<*>> defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'ErrorCandidateContext' @ [62:19] ==> public constructor ErrorCandidateContext(scopeTower: ImplicitScopeTower, name: Name, explicitReceiver: DetailedReceiver?) defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[ClassConstructorDescriptorImpl]

'scopeTower' @ [62:41] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.collectErrorCandidatesForVariable[ValueParameterDescriptorImpl]

'name' @ [62:53] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.collectErrorCandidatesForVariable[ValueParameterDescriptorImpl]

'explicitReceiver' @ [62:59] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.collectErrorCandidatesForVariable[ValueParameterDescriptorImpl]

'context' @ [63:5] ==> val context: ErrorCandidateContext defined in org.jetbrains.kotlin.resolve.calls.tower.collectErrorCandidatesForVariable[LocalVariableDescriptor]

'asClassifierCall' @ [63:13] ==> private fun ErrorCandidateContext.asClassifierCall(asFunction: Boolean): Unit defined in org.jetbrains.kotlin.resolve.calls.tower in file ErrorCandidateFactory.kt[SimpleFunctionDescriptorImpl]

'context' @ [64:12] ==> val context: ErrorCandidateContext defined in org.jetbrains.kotlin.resolve.calls.tower.collectErrorCandidatesForVariable[LocalVariableDescriptor]

'result' @ [64:20] ==> public final val result: SmartList<ErrorCandidate<*>> defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'SmartList' @ [72:18] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ErrorCandidate<*>

'result' @ [74:50] ==> public final val result: SmartList<ErrorCandidate<*>> defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'add' @ [74:57] ==> public open fun add(element: (ErrorCandidate<*>..ErrorCandidate<*>?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'errorCandidate' @ [74:61] ==> value-parameter errorCandidate: ErrorCandidate<*> defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext.add[ValueParameterDescriptorImpl]

'when (explicitReceiver) {
                is ReceiverValueWithSmartCastInfo -> {
                    explicitReceiver.receiverValue.type.memberScope.getContributedClassifier(name, scopeTower.location)
                }
                is QualifierReceiver -> {
                    explicitReceiver.staticScope.getContributedClassifier(name, scopeTower.location)
                }
                else -> scopeTower.lexicalScope.findClassifier(name, scopeTower.location)
            }' @ [79:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassifierDescriptor?, entry1: ClassifierDescriptor?, entry2: ClassifierDescriptor?): ClassifierDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassifierDescriptor?

'explicitReceiver' @ [79:19] ==> public final val explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'explicitReceiver' @ [81:21] ==> public final val explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'receiverValue' @ [81:38] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'type' @ [81:52] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'memberScope' @ [81:57] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedClassifier' @ [81:69] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [81:94] ==> public final val name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'scopeTower' @ [81:100] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'location' @ [81:111] ==> public abstract val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'explicitReceiver' @ [84:21] ==> public final val explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'staticScope' @ [84:38] ==> public abstract val staticScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.receivers.QualifierReceiver[PropertyDescriptorImpl]

'getContributedClassifier' @ [84:50] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [84:75] ==> public final val name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'scopeTower' @ [84:81] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'location' @ [84:92] ==> public abstract val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'scopeTower' @ [86:25] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'lexicalScope' @ [86:36] ==> public abstract val lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'findClassifier' @ [86:49] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils in file ScopeUtils.kt[SimpleFunctionDescriptorImpl]

'name' @ [86:64] ==> public final val name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'scopeTower' @ [86:70] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'location' @ [86:81] ==> public abstract val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'getWrongResolutionToClassifier' @ [89:16] ==> private fun ErrorCandidateContext.getWrongResolutionToClassifier(classifier: ClassifierDescriptor, asFunction: Boolean): WrongResolutionToClassifier? defined in org.jetbrains.kotlin.resolve.calls.tower in file ErrorCandidateFactory.kt[SimpleFunctionDescriptorImpl]

'classifier' @ [89:47] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.asClassifierCall[LocalVariableDescriptor]

'asFunction' @ [89:59] ==> value-parameter asFunction: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.asClassifierCall[ValueParameterDescriptorImpl]

'add' @ [91:5] ==> public final fun add(errorCandidate: ErrorCandidate<*>): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[SimpleFunctionDescriptorImpl]

'Classifier' @ [91:24] ==> public constructor Classifier(classifierDescriptor: ClassifierDescriptor, kind: WrongResolutionToClassifier) defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidate.Classifier[ClassConstructorDescriptorImpl]

'classifier' @ [91:35] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.asClassifierCall[LocalVariableDescriptor]

'kind' @ [91:47] ==> val kind: WrongResolutionToClassifier defined in org.jetbrains.kotlin.resolve.calls.tower.asClassifierCall[LocalVariableDescriptor]

'when (classifier) {
            is TypeAliasDescriptor -> classifier.classDescriptor?.let { getWrongResolutionToClassifier(it, asFunction) }

            is TypeParameterDescriptor -> if (asFunction) TYPE_PARAMETER_AS_FUNCTION else TYPE_PARAMETER_AS_VALUE

            is ClassDescriptor -> {
                when (classifier.kind) {
                    ClassKind.INTERFACE -> if (asFunction) INTERFACE_AS_FUNCTION else INTERFACE_AS_VALUE

                    ClassKind.OBJECT -> if (asFunction) OBJECT_AS_FUNCTION else null

                    ClassKind.CLASS -> when {
                        asFunction && explicitReceiver is QualifierReceiver? && classifier.isInner -> INNER_CLASS_CONSTRUCTOR_NO_RECEIVER
                        !asFunction -> CLASS_AS_VALUE
                        else -> null
                    }

                    else -> null
                }
            }

            else -> null
        }' @ [95:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: WrongResolutionToClassifier?, entry1: WrongResolutionToClassifier?, entry2: WrongResolutionToClassifier?, entry3: WrongResolutionToClassifier?): WrongResolutionToClassifier?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> WrongResolutionToClassifier?

'classifier' @ [95:15] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.getWrongResolutionToClassifier[ValueParameterDescriptorImpl]

'classifier' @ [96:39] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.getWrongResolutionToClassifier[ValueParameterDescriptorImpl]

'classDescriptor' @ [96:50] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'let' @ [96:67] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> WrongResolutionToClassifier?): WrongResolutionToClassifier? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> WrongResolutionToClassifier?

'getWrongResolutionToClassifier' @ [96:73] ==> private fun ErrorCandidateContext.getWrongResolutionToClassifier(classifier: ClassifierDescriptor, asFunction: Boolean): WrongResolutionToClassifier? defined in org.jetbrains.kotlin.resolve.calls.tower in file ErrorCandidateFactory.kt[SimpleFunctionDescriptorImpl]

'it' @ [96:104] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.getWrongResolutionToClassifier.<anonymous>[ValueParameterDescriptorImpl]

'asFunction' @ [96:108] ==> value-parameter asFunction: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.getWrongResolutionToClassifier[ValueParameterDescriptorImpl]

'if (asFunction) TYPE_PARAMETER_AS_FUNCTION else TYPE_PARAMETER_AS_VALUE' @ [98:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: WrongResolutionToClassifier, elseBranch: WrongResolutionToClassifier): WrongResolutionToClassifier[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> WrongResolutionToClassifier

'asFunction' @ [98:47] ==> value-parameter asFunction: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.getWrongResolutionToClassifier[ValueParameterDescriptorImpl]

'TYPE_PARAMETER_AS_FUNCTION' @ [98:59] ==> enum entry TYPE_PARAMETER_AS_FUNCTION defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[FakeCallableDescriptorForObject]

'TYPE_PARAMETER_AS_VALUE' @ [98:91] ==> enum entry TYPE_PARAMETER_AS_VALUE defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[FakeCallableDescriptorForObject]

'when (classifier.kind) {
                    ClassKind.INTERFACE -> if (asFunction) INTERFACE_AS_FUNCTION else INTERFACE_AS_VALUE

                    ClassKind.OBJECT -> if (asFunction) OBJECT_AS_FUNCTION else null

                    ClassKind.CLASS -> when {
                        asFunction && explicitReceiver is QualifierReceiver? && classifier.isInner -> INNER_CLASS_CONSTRUCTOR_NO_RECEIVER
                        !asFunction -> CLASS_AS_VALUE
                        else -> null
                    }

                    else -> null
                }' @ [101:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: WrongResolutionToClassifier?, entry1: WrongResolutionToClassifier?, entry2: WrongResolutionToClassifier?, entry3: WrongResolutionToClassifier?): WrongResolutionToClassifier?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> WrongResolutionToClassifier?

'classifier' @ [101:23] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.getWrongResolutionToClassifier[ValueParameterDescriptorImpl]

'kind' @ [101:34] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [102:31] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'if (asFunction) INTERFACE_AS_FUNCTION else INTERFACE_AS_VALUE' @ [102:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: WrongResolutionToClassifier, elseBranch: WrongResolutionToClassifier): WrongResolutionToClassifier[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> WrongResolutionToClassifier

'asFunction' @ [102:48] ==> value-parameter asFunction: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.getWrongResolutionToClassifier[ValueParameterDescriptorImpl]

'INTERFACE_AS_FUNCTION' @ [102:60] ==> enum entry INTERFACE_AS_FUNCTION defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[FakeCallableDescriptorForObject]

'INTERFACE_AS_VALUE' @ [102:87] ==> enum entry INTERFACE_AS_VALUE defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[FakeCallableDescriptorForObject]

'OBJECT' @ [104:31] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'if (asFunction) OBJECT_AS_FUNCTION else null' @ [104:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: WrongResolutionToClassifier?, elseBranch: WrongResolutionToClassifier?): WrongResolutionToClassifier?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> WrongResolutionToClassifier?

'asFunction' @ [104:45] ==> value-parameter asFunction: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.getWrongResolutionToClassifier[ValueParameterDescriptorImpl]

'OBJECT_AS_FUNCTION' @ [104:57] ==> enum entry OBJECT_AS_FUNCTION defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[FakeCallableDescriptorForObject]

'CLASS' @ [106:31] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'when {
                        asFunction && explicitReceiver is QualifierReceiver? && classifier.isInner -> INNER_CLASS_CONSTRUCTOR_NO_RECEIVER
                        !asFunction -> CLASS_AS_VALUE
                        else -> null
                    }' @ [106:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: WrongResolutionToClassifier?, entry1: WrongResolutionToClassifier?, entry2: WrongResolutionToClassifier?): WrongResolutionToClassifier?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> WrongResolutionToClassifier?

'asFunction' @ [107:25] ==> value-parameter asFunction: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.getWrongResolutionToClassifier[ValueParameterDescriptorImpl]

'explicitReceiver' @ [107:39] ==> public final val explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidateContext[PropertyDescriptorImpl]

'classifier' @ [107:81] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.getWrongResolutionToClassifier[ValueParameterDescriptorImpl]

'isInner' @ [107:92] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'INNER_CLASS_CONSTRUCTOR_NO_RECEIVER' @ [107:103] ==> enum entry INNER_CLASS_CONSTRUCTOR_NO_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[FakeCallableDescriptorForObject]

'!' @ [108:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'asFunction' @ [108:26] ==> value-parameter asFunction: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.getWrongResolutionToClassifier[ValueParameterDescriptorImpl]

'CLASS_AS_VALUE' @ [108:40] ==> enum entry CLASS_AS_VALUE defined in org.jetbrains.kotlin.resolve.calls.tower.WrongResolutionToClassifier[FakeCallableDescriptorForObject]

