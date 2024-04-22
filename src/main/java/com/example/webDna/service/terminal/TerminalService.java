package com.example.webDna.service.terminal;

import com.example.webDna.entity.vo.terminal.TerminalVo;
import com.example.webDna.util.response.Response;

public interface TerminalService {
    Response saveTerminal(TerminalVo terminalVo, Response response);

    Response updateTerminal(TerminalVo terminalVo, Response response);

    Response deleteTerminal(Long id, Response response);

    Response getTerminal(Integer pageNumber,Integer pageSize,Response response);
}
