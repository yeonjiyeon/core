package hello.core.member;

public class MemberServiceImpl implements MemberService{

    //private MemberRepository memberRepository = new MemoryMemberRepository();--> AppConfig에 등록해서 구현체를 지워준다
    //null값이 들어오지 않게 구현체를 생성해 준다
    private final MemberRepository memberRepository;
    public MemberServiceImpl(MemberRepository memberRepository){//AppConfig에서 생성자를 호출하면서 구현체를 넣어준다
        this.memberRepository = memberRepository;
    }
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
    
    
    //테스트용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}
